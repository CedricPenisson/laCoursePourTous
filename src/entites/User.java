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
public class User {
    /*liste des attributs de la classe */
    
    private String numeroUtilisateur;
    private String nomUtilisateur ;
    private String prenomUtilisateur ;
    private String mailUtilisateur ; 
    private String motDePasseUtilisateur ;
    
    /* le constructeur*/

    /**
     *
     * @param numeroUtilisateur
     * @param nomUtilisateur
     * @param prenomUtilisateur
     * @param mailUtilisateur
     * @param motDePasseUtilisateur
     */

    public User (String numeroUtilisateur, String nomUtilisateur, String prenomUtilisateur, String mailUtilisateur, String motDePasseUtilisateur ){
        this.numeroUtilisateur = numeroUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur ;
        this.mailUtilisateur = mailUtilisateur ;
        this.motDePasseUtilisateur = motDePasseUtilisateur;
    }
    //création des methodes get et set

    public String getNumeroUtilisateur() {
        return numeroUtilisateur;
    }

    public void setNumeroUtilisateur(String numeroUtilisateur) {
        this.numeroUtilisateur = numeroUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }

    public String getMotDePasseUtilisateur() {
        return motDePasseUtilisateur;
    }

    public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
        this.motDePasseUtilisateur = motDePasseUtilisateur;
    }
   
    
   
}
