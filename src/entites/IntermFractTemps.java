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
public class IntermFractTemps {
    
    private int indexIFT;
    private String tempsIFT;
    private String repetitionIFT;
    private String nbserieIFT;
    private String allureIFT;
    private String exercice_idexercice;
    
    
public IntermFractTemps(int indexIFT, String tempsIFT, String repetitionIFT, String nbserieIFT, String allureIFT, String exercice_idexercice){

    this.indexIFT = indexIFT;
    this.tempsIFT = tempsIFT;
    this.repetitionIFT = repetitionIFT;
    this.nbserieIFT = nbserieIFT;
    this.allureIFT = allureIFT;
    this.exercice_idexercice = exercice_idexercice;
}

    public int getIndexIFT() {
        return indexIFT;
    }

    public void setIndexIFT(int indexIFT) {
        this.indexIFT = indexIFT;
    }

    public String getTempsIFT() {
        return tempsIFT;
    }

    public void setTempsIFT(String tempsIFT) {
        this.tempsIFT = tempsIFT;
    }

    public String getRepetitionIFT() {
        return repetitionIFT;
    }

    public void setRepetitionIFT(String repetitionIFT) {
        this.repetitionIFT = repetitionIFT;
    }

    public String getNbserieIFT() {
        return nbserieIFT;
    }

    public void setNbserieIFT(String nbserieIFT) {
        this.nbserieIFT = nbserieIFT;
    }

    public String getAllureIFT() {
        return allureIFT;
    }

    public void setAllureIFT(String allureIFT) {
        this.allureIFT = allureIFT;
    }

    public String getExercice_idexercice() {
        return exercice_idexercice;
    }

    public void setExercice_idexercice(String exercice_idexercice) {
        this.exercice_idexercice = exercice_idexercice;
    }
    
}
