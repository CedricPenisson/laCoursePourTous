<?php

	session_start();

	if(!empty($_POST['email']) && !empty($_POST['password'])) {

		require('src/connect.php');

		// VARIABLES

		$email		= htmlspecialchars($_POST['email']);
		$password	= htmlspecialchars($_POST['password']);

		// ADRESSE EMAIL SYNTAXE

		if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {

			header('location: index.php?error=1&message=Votre adresse email est invalide.');
			exit();
		}

		// CHIFFRAGE DU MOT DE PASSE

		$password = "22".sha1($password."20012020")."35";

		// EMAIL DEJA UTILILSEE

		$req = $db->prepare("SELECT count(*) as numberEmail FROM compteutilisateur WHERE MailUtilisateur=?");
		$req->execute(array($email));

		while($email_verification = $req->fetch()) {
			if($email_verification['numberEmail'] != 1) {
				header('location: index.php?error=1&message=Impossible de vous(mail) authentifier correctement.');
				exit();
			}
		}

		// CONNEXION

		$req = $db->prepare("SELECT * FROM compteutilisateur WHERE MailUtilisateur = ?");
		$req->execute(array($email));

		while($user = $req->fetch()) {

			if($password == $user['password']) {

				$_SESSION['connect'] = 1;
				$_SESSION['email']   = $user['email'];

				header('location: index.php?success=1');
				exit();
			}
			else {
				header('location: index.php?error=1&message=Impossible de vous(mdp) authentifier correctement.');
				exit();
			}
		}
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
				<h1>S'identifier</h1>
				
				<?php if(isset($_GET['error'])) {

					if(isset($_GET['message'])) {
						echo'<div class="alert error">'.htmlspecialchars($_GET['message']).'</div>';
					}
				} else if(isset($_GET['success'])) {
					echo'<div class="alert success">Vous êtes maintenant connecté.</div>';
				}?>


				<form method="post" action="index.php">
					<input type="email" name="email" placeholder="Votre adresse email" required />
					<input type="password" name="password" placeholder="Mot de passe" required />
					<button type="submit">S'identifier</button>
					<label id="option"><input type="checkbox" name="auto" checked />Se souvenir de moi</label>
				</form>
			

				<p class="grey">Première visite sur<strong> La course pour tous</strong> ?<br> <a href="inscription.php">Inscrivez-vous</a>.</p>
		</div>
	</section>

	<?php include('src/footer.php'); ?>
</body>
</html>