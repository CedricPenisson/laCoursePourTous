/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoursepourtous;

import BDD.CBDD;
import entites.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BTS sio
 */
public class Echauffement {
    

    
        protected CBDD bdd;
            
        public Echauffement(CBDD bdd){
            this.bdd = bdd;
        }
        
    public Echauffement convertir_Echauffement (ResultSet rs) {
        try {
            String IdEchauffement = rs.getString(1);
            String footingtemps_indexfootps = rs.getString(2);



            Echauffement echauffement = new Echauffement(IdEchauffement, footingtemps_indexfootps );

            return echauffement;
        } catch (SQLException ex) {
            Logger.getLogger(ApplicationCompte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


        
        
        
    
}
