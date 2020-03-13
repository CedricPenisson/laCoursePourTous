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
public class DebutantFractDist {
    
    	private int indexDFD;
        private String tempsDFD;
        private String repetitionDFD;
        private String nbSerieDFD;
        private String allureDFD;
        private String exercice_idexercice;
        
public DebutantFractDist(int indexDFD, String tempsDFD, String repetitionDFD, String nbSerieDFD, String allureDFD, String exercice_idexercice){

        this.indexDFD = indexDFD;
        this.tempsDFD = tempsDFD;
        this.repetitionDFD = repetitionDFD;
        this.nbSerieDFD = nbSerieDFD;
        this.allureDFD = allureDFD;
        this.exercice_idexercice = exercice_idexercice;
        
}

    public int getIndexDFD() {
        return indexDFD;
    }

    public void setIndexDFD(int indexDFD) {
        this.indexDFD = indexDFD;
    }

    public String getTempsDFD() {
        return tempsDFD;
    }

    public void setTempsDFD(String tempsDFD) {
        this.tempsDFD = tempsDFD;
    }

    public String getRepetitionDFD() {
        return repetitionDFD;
    }

    public void setRepetitionDFD(String repetitionDFD) {
        this.repetitionDFD = repetitionDFD;
    }

    public String getNbSerieDFD() {
        return nbSerieDFD;
    }

    public void setNbSerieDFD(String nbSerieDFD) {
        this.nbSerieDFD = nbSerieDFD;
    }

    public String getAllureDFD() {
        return allureDFD;
    }

    public void setAllureDFD(String allureDFD) {
        this.allureDFD = allureDFD;
    }

    public String getExercice_idexercice() {
        return exercice_idexercice;
    }

    public void setExercice_idexercice(String exercice_idexercice) {
        this.exercice_idexercice = exercice_idexercice;
    }




}
