/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lacoursepourtous;

import BDD.CBDD;
import BDD.ParametresStockageBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BTS sio
 */
    public class Echauffement {
    
        private String IdEchauffement;
        private String footingtemps_indexfootps;
        
    public Echauffement (String IdEchauffement, String footingtemps_indexfootps){
        this.IdEchauffement = IdEchauffement;
        this.footingtemps_indexfootps = footingtemps_indexfootps;
        
    }
        public String getIdEchauffement() {
        return IdEchauffement;
    }

    public void setIdEchauffement(String IdEchauffement) {
        this.IdEchauffement = IdEchauffement;
    }

    public String getFootingtemps_indexfootps() {
        return footingtemps_indexfootps;
    }

    public void setFootingtemps_indexfootps(String footingtemps_indexfootps) {
        this.footingtemps_indexfootps = footingtemps_indexfootps;
    }


    protected CBDD bdd;

    public Echauffement(CBDD bdd){
        this.bdd = bdd;
    }
        
    public Echauffement convertir_Echauffement (ResultSet rs) {
        try {

            String IdEchauffement = rs.getString(1);
            String footingtemps_indexfootps = rs.getString(2);


           Echauffement echauffement = new Echauffement(IdEchauffement, footingtemps_indexfootps);

            return echauffement;
        } catch (SQLException ex) {
            Logger.getLogger(ApplicationCompte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int ajouterEchauffement(Echauffement echauffement) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "INSERT INTO `echauffement` (`IdEchauffement`, `footingtemps_indexfoots`"
                    + "VALUES ('" + CBDD.pretraiterChaineSQL(echauffement.getIdEchauffement())
                    + "', '" + CBDD.pretraiterChaineSQL(echauffement.getFootingtemps_indexfootps()) +"');";
                    
            res = bdd.executerRequeteUpdate(req);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }
    
        public int supprimerEchauffement(Echauffement echauffement) {
        int res = -1;
        if (bdd.connecter() == true) {
            String req = "DELETE FROM `echauffement` WHERE `IdEchauffement` = " + echauffement.getIdEchauffement();
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
        String IdEchauffement = "1";
        String footingtemps_indexfoots = "";
        
        User userTest = new User(numeroUtilisateur, nomUtilisateur, prenomUtilisateur, mailUtilisateur, motDePasseUtilisateur, secretUtilisateur);
        */
        //table.ajouterUser(userTest);
        //table.supprimerEchauffement();
        //table.afficherUsers();
        //table.modifierUser(userTest);
    }
        
        
        
    
}
