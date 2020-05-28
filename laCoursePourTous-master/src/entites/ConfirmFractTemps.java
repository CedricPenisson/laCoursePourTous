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
public class ConfirmFractTemps {
    
    private int indexCFT;
    private String tempsCFT;
    private String repetitionCFT;       
    private String nbSerieCFT;       
    private String allureCFT;       
    private String exercice_idexercice;
    
    
public ConfirmFractTemps (int indexCFT, String tempsCFT, String repetitionCFT, String nbSerieCFT, String allureCFT, String exercice_idexercice){

    this.indexCFT = indexCFT;
    this.tempsCFT = tempsCFT;
    this.repetitionCFT = repetitionCFT;
    this.nbSerieCFT = nbSerieCFT;
    this.allureCFT = allureCFT;
    this.exercice_idexercice = exercice_idexercice;
}

    public int getIndexCFT() {
        return indexCFT;
    }

    public void setIndexCFT(int indexCFT) {
        this.indexCFT = indexCFT;
    }

    public String getTempsCFT() {
        return tempsCFT;
    }

    public void setTempsCFT(String tempsCFT) {
        this.tempsCFT = tempsCFT;
    }

    public String getRepetitionCFT() {
        return repetitionCFT;
    }

    public void setRepetitionCFT(String repetitionCFT) {
        this.repetitionCFT = repetitionCFT;
    }

    public String getNbSerieCFT() {
        return nbSerieCFT;
    }

    public void setNbSerieCFT(String nbSerieCFT) {
        this.nbSerieCFT = nbSerieCFT;
    }

    public String getAllureCFT() {
        return allureCFT;
    }

    public void setAllureCFT(String allureCFT) {
        this.allureCFT = allureCFT;
    }

    public String getExercice_idexercice() {
        return exercice_idexercice;
    }

    public void setExercice_idexercice(String exercice_idexercice) {
        this.exercice_idexercice = exercice_idexercice;
    }


}   
