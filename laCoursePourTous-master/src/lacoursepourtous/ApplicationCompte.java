/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoursepourtous;

import BDD.CBDD;
import BDD.ParametresStockageBDD;
import entites.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fannie & Cédric
 */
public class ApplicationCompte {

        protected CBDD bdd;
            
        public ApplicationCompte(CBDD bdd){
            this.bdd = bdd;
        }
        
/*    
//déclaration des attributs de la classe
   
    
    
//création du constructeur
    public ApplicationCompte(String numCompte,String User){
        
       // User unUser = unUser;
        
    }
    
    // Méthode pour créer un utilisateur.
    
    public  static User createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--\nQuel est votre nom ?");
        String nom = sc.nextLine();
        System.out.println("Quel est votre prénom ?");
        String prenom= sc.nextLine();
        System.out.println("Quelle est votre adresse mail ?");
        String mail = sc.nextLine();
        System.out.println("Entrez vorte mot de passe ?");
        String mdp= sc.nextLine();
        

        User unUser = new User(nom, prenom, mail, mdp);
        return unUser;
    }
    
    public static void afficherUser(User user){
        System.out.println("Nom : "+ user.getNom());
        System.out.println("Prénom : "+ user.getPrenom());
        System.out.println("Adresse Mail : "+ user.getMail());
        System.out.println("Mot de Passe : "+ user.getMdp());
        
    }
    
            
    //méthode statique de test unitaire 
    public static void main(String[] args){
           User user = createUser();
           System.out.println(user.getNom());
           
           ApplicationCompte.afficherUser(user);

        //User user1= new User("dupond", "jhon", "adbc@gmail.com", "motdepasse1");
        //System.out.println("l'utitisateur 1 est :" + user1.getPrenom()+" "+ user1.getNom());
        
        
        //comment créer un dictionnaire clé, valeur 
        /* Map<String, Integer> compte = new HashMap<>();
            compte.put("User", 1);
            compte.put("User2", 2);
            compte.put("User3", 25);
            
            System.out.println(compte.toString());
            
            for(Entry<String, Integer> element: compte.entrySet()){
                System.out.println("la clé est :"+ element.getKey()+" , et la valeur est : "+ element.getValue());
            }*/
        
        

    
    public User convertir_User (ResultSet rs) {
        try {
            String numeroUtilisateur = rs.getString(1);
            String nomUtilisateur = rs.getString(2);
            String prenomUtilisateur = rs.getString(3);
            String mailUtilisateur = rs.getString(4);
            String motDePasseUtilisateur = rs.getString(5);
            String secretUtilisateur = rs.getString(6);


            User user = new User(numeroUtilisateur, nomUtilisateur, prenomUtilisateur, mailUtilisateur, motDePasseUtilisateur, secretUtilisateur);

            return user;
        } catch (SQLException ex) {
            Logger.getLogger(ApplicationCompte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
        
        
    public User afficherUser(int numeroUtilisateur){
        User user = null;
        if (bdd.connecter() == true) {
            System.out.println("Connexion OK");
            ResultSet rs = bdd.executerRequeteQuery("select * from compteutilisateur  WHERE `compteutilisateur`.`numeroUtilisateur` = " + numeroUtilisateur);
            try {
                if (rs.next()) {
                    user = convertir_User(rs);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return user;
    }
    
    public ArrayList<User> afficherUsers() {

        if (bdd.connecter() == true) {
            ArrayList<User> listeUsers = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("select * from compteutilisateur");
            try {
                while (rs.next()) {
                    User user = convertir_User(rs);
                    listeUsers.add(user);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            bdd.deconnecter();
            return listeUsers;
        } else {
            System.out.println("Connexion KO");
        }
        return null;
    }    
        
    public int ajouterUser(User user) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "INSERT INTO `compteutilisateur` (`numeroUtilisateur`, `nomUtilisateur`, `prenomUtilisateur`,"
                    + " `mailUtilisateur`, `motDePasseUtilisateur`, `secretUtilisateur`) "
                    + "VALUES ('" + CBDD.pretraiterChaineSQL(user.getNumeroUtilisateur())
                    + "', '" + CBDD.pretraiterChaineSQL(user.getNomUtilisateur())
                    + "', '" + CBDD.pretraiterChaineSQL(user.getPrenomUtilisateur())
                    + "', '" + CBDD.pretraiterChaineSQL(user.getMailUtilisateur())
                    + "', '" + CBDD.pretraiterChaineSQL(user.getMotDePasseUtilisateur())
                    + "', '" + CBDD.pretraiterChaineSQL(user.getSecretUtilisateur())
                    + "');";
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }
    
    
        public int supprimerUser(User user) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM `compteutilisateur` WHERE `numeroUtilisateur` = " + user.getNumeroUtilisateur();
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }
     
        
    public int modifierUser(User user) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "UPDATE `compteutilisateur`"
                    + "SET `NomUtilisateur` = '" + user.getNomUtilisateur()+ "', `prenomUtilisateur` = '" + user.getPrenomUtilisateur() + "', `mailUtilisateur` = '" 
                    +  user.getMailUtilisateur() + "', `motDePasseUtilisateur` = '" + user.getMotDePasseUtilisateur() +  "', `secretUtilisateur` = '" + user.getSecretUtilisateur() + "' WHERE `compteutilisateur`.`numeroUtilisateur` =" + user.getNumeroUtilisateur();
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }        
        
        

    public static void main(String[] args) {
        CBDD bdd = new CBDD(new ParametresStockageBDD("parametresBdd.properties"));
        ApplicationCompte table = new ApplicationCompte(bdd);  
        /*
        String numeroUtilisateur = "5";
        String nomUtilisateur = "Penisson";
        String prenomUtilisateur = "Cédric";
        String mailUtilisateur = "thebeautifull@thebeautifull.fr";
        String motDePasseUtilisateur = "mapaupiete"; 
        String secretUtilisateur = "";
        
        User userTest = new User(numeroUtilisateur, nomUtilisateur, prenomUtilisateur, mailUtilisateur, motDePasseUtilisateur, secretUtilisateur);
        */
        //table.ajouterUser(userTest);
        //table.supprimerUser(userTest);
        table.afficherUsers();
        //table.modifierUser(userTest);
    }

}
    
    

