<?php
	session_start(); // CREATION DE SESSION 

	if(!empty($_POST['nom']) && !empty($_POST['prenom']) && !empty($_POST['email']) && !empty($_POST['password']) && !empty($_POST['password_two'])) {

		require('src/connect.php'); // CONNEXION A LA BASE DE DONNEES
		// VARIABLES

		$nom			= htmlspecialchars($_POST['nom']);					// htmlspecialchars transforme tout le texte en language html 
		$prenom			= htmlspecialchars($_POST['prenom']);				// C'est une sécurité.
		$email 			= htmlspecialchars($_POST['email']);				
		$password 		= htmlspecialchars($_POST['password']);
		$password_two 	= htmlspecialchars($_POST['password_two']);

		// PASSWORD = PASSWORD_TWO

		if($password != $password_two) {

			header('location: inscription.php?error=1&message=Vos mots de passe ne sont pas identiques');
			exit();
		}	

		//	ADRESSE EMAIL VALIDE ?	

		if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {		

			header('location: inscription.php?error=1&message=Votre adresse email est invalide.');
			exit();
		}

		// EMAIL DEJA UTILISEE

		$req = $db->prepare("SELECT count(*) as numberEmail FROM compteutilisateur WHERE MailUtilisateur=?");
		$req->execute(array($email));

		while($email_verification = $req->fetch()) {
			if($email_verification['numberEmail'] != 0) {
				header('location: inscription.php?error=1&message=Votre adresse email est déjà utilisée par un autre utilisateur.');
				exit();
			}
		}

		// HASH

		$secret = sha1($email).time();
		$secret = sha1($secret).time();

		// CHIFFRAGE DU MOT DE PASSE

		$password = "22".sha1($password."20012020")."35";

		// ENVOI

		$req = $db->prepare("INSERT INTO compteutilisateur(NomUtilisateur, PrenomUtilisateur, MailUtilisateur, MotDePasseUtilisateur, SecretUtilisateur) VALUES(?, ?, ?, ?, ?)");
		$req->execute(array($nom, $prenom, $email, $password, $secret));

		header('location: inscription.php?success=1');
			exit();		
	}
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>La course pour tous</title>
	<link rel="stylesheet" type="text/css" href="design/default.css">
	<link rel="icon" type="image/pngn" href="img/favicon.png">
</head>
<body>

	<?php include('src/header.php'); ?>
	
	<section>
		<div id="login-body">
			<h1>S'inscrire</h1>

			<?php if(isset($_GET['error'])) {

						if(isset($_GET['message'])) {

						echo'<div class="alert error">'.htmlspecialchars($_GET['message']).'</div>';
						}
					} else if(isset($_GET['success'])) {
						echo'<div class="alert success">Vous pouvez maintenant vous connecter.</div>'; 
					}
			?>

			<form method="post" action="inscription.php">
				<input type="text" name="nom" placeholder="Dupuis" required />
				<input type="text" name="prenom" placeholder="Julien" required />
				<input type="email" name="email" placeholder="exemple@email.com" required />
				<input type="password" name="password" placeholder="Mot de passe" required />
				<input type="password" name="password_two" placeholder="Confirmation du mot de passe" required />
				<button type="submit">S'inscrire</button>
			</form>

			<p class="grey">Déjà sur <strong>La course pour tous</strong> ? <a href="index.php">Connectez-vous</a>.</p>
		</div>
	</section>

	<?php include('src/footer.php'); ?>
</body>
</html>