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
public class DebutantFracTemps {
    
    	private int indexDFT;
        private String tempsDFT;
        private String RepetitionDFT;
        private String NbSerieDFT;
        private String AllureDFT;
        private String exercice_idexercice;
        
public DebutantFracTemps(int indexDFT, String tempsDFT, String repetitionDFT, String nbSerieDFT, String allureDFT, String exercice_idexercice){

        this.indexDFT = indexDFT;
        this.tempsDFT = tempsDFT;
        this.RepetitionDFT = repetitionDFT;
        this.NbSerieDFT = nbSerieDFT;
        this.AllureDFT = allureDFT;
        this.exercice_idexercice = exercice_idexercice;
        
}

    public int getIndexDFT() {
        return indexDFT;
    }

    public void setIndexDFT(int indexDFT) {
        this.indexDFT = indexDFT;
    }

    public String getTempsDFT() {
        return tempsDFT;
    }

    public void setTempsDFT(String tempsDFT) {
        this.tempsDFT = tempsDFT;
    }

    public String getRepetitionDFT() {
        return RepetitionDFT;
    }

    public void setRepetitionDFT(String RepetitionDFT) {
        this.RepetitionDFT = RepetitionDFT;
    }

    public String getNbSerieDFT() {
        return NbSerieDFT;
    }

    public void setNbSerieDFT(String NbSerieDFT) {
        this.NbSerieDFT = NbSerieDFT;
    }

    public String getAllureDFT() {
        return AllureDFT;
    }

    public void setAllureDFT(String AllureDFT) {
        this.AllureDFT = AllureDFT;
    }

    public String getExercice_idexercice() {
        return exercice_idexercice;
    }

    public void setExercice_idexercice(String exercice_idexercice) {
        this.exercice_idexercice = exercice_idexercice;
    }



}
