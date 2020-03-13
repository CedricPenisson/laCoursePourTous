/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author BTS sio
 */
public class Footing {
    
    private int indexFooTps;
    private String tempsFT;
    private String allureFT;
    private String recuperation_idrecuparation;
    private String echauffement_idechauffement;
    
    
public Footing (int indexFooTps, String tempsFT, String allureFT, String recuperation_idrecuparation, String echauffement_idechauffement){

    this.indexFooTps = indexFooTps;
    this.tempsFT = tempsFT;
    this.allureFT = allureFT;
    this.echauffement_idechauffement = echauffement_idechauffement;
    this.recuperation_idrecuparation = recuperation_idrecuparation;
    
}

    public int getIndexFooTps() {
        return indexFooTps;
    }

    public void setIndexFooTps(int indexFooTps) {
        this.indexFooTps = indexFooTps;
    }

    public String getTempsFT() {
        return tempsFT;
    }

    public void setTempsFT(String tempsFT) {
        this.tempsFT = tempsFT;
    }

    public String getAllureFT() {
        return allureFT;
    }

    public void setAllureFT(String allureFT) {
        this.allureFT = allureFT;
    }

    public String getRecuperation_idrecuparation() {
        return recuperation_idrecuparation;
    }

    public void setRecuperation_idrecuparation(String recuperation_idrecuparation) {
        this.recuperation_idrecuparation = recuperation_idrecuparation;
    }

    public String getEchauffement_idechauffement() {
        return echauffement_idechauffement;
    }

    public void setEchauffement_idechauffement(String echauffement_idechauffement) {
        this.echauffement_idechauffement = echauffement_idechauffement;
    }

    
    
}
