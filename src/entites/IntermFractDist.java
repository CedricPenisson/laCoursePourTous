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
public class IntermFractDist {
    
    	private int indexIFD;
        private String distanceIFD;
        private String repetitionIFD;
        private String nbSerieIFD;
        private String allureIFD;
        private String exercice_idexercice;
        
public IntermFractDist(int indexIFD, String distanceIFD, String repetitionIFD, String nbSerieIFD, String allureIFD, String exercice_idexercice){
    
        this.indexIFD = indexIFD;
        this.distanceIFD = distanceIFD;
        this.repetitionIFD = repetitionIFD;
        this.nbSerieIFD = nbSerieIFD;
        this.allureIFD = allureIFD;
        this.exercice_idexercice = exercice_idexercice;
}

    public int getIndexIFD() {
        return indexIFD;
    }

    public void setIndexIFD(int indexIFD) {
        this.indexIFD = indexIFD;
    }

    public String getDistanceIFD() {
        return distanceIFD;
    }

    public void setDistanceIFD(String distanceIFD) {
        this.distanceIFD = distanceIFD;
    }

    public String getRepetitionIFD() {
        return repetitionIFD;
    }

    public void setRepetitionIFD(String repetitionIFD) {
        this.repetitionIFD = repetitionIFD;
    }

    public String getNbSerieIFD() {
        return nbSerieIFD;
    }

    public void setNbSerieIFD(String nbSerieIFD) {
        this.nbSerieIFD = nbSerieIFD;
    }

    public String getAllureIFD() {
        return allureIFD;
    }

    public void setAllureIFD(String allureIFD) {
        this.allureIFD = allureIFD;
    }

    public String getExercice_idexercice() {
        return exercice_idexercice;
    }

    public void setExercice_idexercice(String exercice_idexercice) {
        this.exercice_idexercice = exercice_idexercice;
    }

}
