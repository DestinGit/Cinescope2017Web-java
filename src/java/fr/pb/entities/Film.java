/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.entities;

import java.io.Serializable;

/**
 *
 * @author formation
 */
public class Film implements Serializable{
    private int idFilm;
    private int idGenre;
    private String titreFilm;
    private String titreOriginalFilm;
    private int totalEntreesFilm;
    private String dateSortieFilm;
    private int entreeSemaineFilm;
    private int nombreSemaineFilm;
    private int anneefilm;
    private String dureeFilm;
    private String condensefilm;
    private String couleursFilm;
    private int interdictionFilm;
    private int publicFilm;
    
    // CONSTRUCTEURS
    public Film() {
    }

    public Film(int idFilm, int idGenre, String titreFilm, String titreOriginalFilm, int totalEntreesFilm, String dateSortieFilm, int entreeSemaineFilm, int nombreSemaineFilm, int anneefilm, String dureeFilm, String condensefilm, String couleursFilm, int interdictionFilm, int publicFilm) {
        this.idFilm = idFilm;
        this.idGenre = idGenre;
        this.titreFilm = titreFilm;
        this.titreOriginalFilm = titreOriginalFilm;
        this.totalEntreesFilm = totalEntreesFilm;
        this.dateSortieFilm = dateSortieFilm;
        this.entreeSemaineFilm = entreeSemaineFilm;
        this.nombreSemaineFilm = nombreSemaineFilm;
        this.anneefilm = anneefilm;
        this.dureeFilm = dureeFilm;
        this.condensefilm = condensefilm;
        this.couleursFilm = couleursFilm;
        this.interdictionFilm = interdictionFilm;
        this.publicFilm = publicFilm;
    }

    public Film(int idGenre, String titreFilm, String titreOriginalFilm, int totalEntreesFilm, String dateSortieFilm, int entreeSemaineFilm, int nombreSemaineFilm, int anneefilm, String dureeFilm, String condensefilm, String couleursFilm, int interdictionFilm, int publicFilm) {
        this.idGenre = idGenre;
        this.titreFilm = titreFilm;
        this.titreOriginalFilm = titreOriginalFilm;
        this.totalEntreesFilm = totalEntreesFilm;
        this.dateSortieFilm = dateSortieFilm;
        this.entreeSemaineFilm = entreeSemaineFilm;
        this.nombreSemaineFilm = nombreSemaineFilm;
        this.anneefilm = anneefilm;
        this.dureeFilm = dureeFilm;
        this.condensefilm = condensefilm;
        this.couleursFilm = couleursFilm;
        this.interdictionFilm = interdictionFilm;
        this.publicFilm = publicFilm;
    }

        // GETTERS AND SETTERS

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public String getTitreOriginalFilm() {
        return titreOriginalFilm;
    }

    public void setTitreOriginalFilm(String titreOriginalFilm) {
        this.titreOriginalFilm = titreOriginalFilm;
    }

    public int getTotalEntreesFilm() {
        return totalEntreesFilm;
    }

    public void setTotalEntreesFilm(int totalEntreesFilm) {
        this.totalEntreesFilm = totalEntreesFilm;
    }

    public String getDateSortieFilm() {
        return dateSortieFilm;
    }

    public void setDateSortieFilm(String dateSortieFilm) {
        this.dateSortieFilm = dateSortieFilm;
    }

    public int getEntreeSemaineFilm() {
        return entreeSemaineFilm;
    }

    public void setEntreeSemaineFilm(int entreeSemaineFilm) {
        this.entreeSemaineFilm = entreeSemaineFilm;
    }

    public int getNombreSemaineFilm() {
        return nombreSemaineFilm;
    }

    public void setNombreSemaineFilm(int nombreSemaineFilm) {
        this.nombreSemaineFilm = nombreSemaineFilm;
    }

    public int getAnneefilm() {
        return anneefilm;
    }

    public void setAnneefilm(int anneefilm) {
        this.anneefilm = anneefilm;
    }

    public String getDureeFilm() {
        return dureeFilm;
    }

    public void setDureeFilm(String dureeFilm) {
        this.dureeFilm = dureeFilm;
    }

    public String getCondensefilm() {
        return condensefilm;
    }

    public void setCondensefilm(String condensefilm) {
        this.condensefilm = condensefilm;
    }

    public String getCouleursFilm() {
        return couleursFilm;
    }

    public void setCouleursFilm(String couleursFilm) {
        this.couleursFilm = couleursFilm;
    }

    public int getInterdictionFilm() {
        return interdictionFilm;
    }

    public void setInterdictionFilm(int interdictionFilm) {
        this.interdictionFilm = interdictionFilm;
    }

    public int getPublicFilm() {
        return publicFilm;
    }

    public void setPublicFilm(int publicFilm) {
        this.publicFilm = publicFilm;
    }

    // AUTRES

    @Override
    public String toString() {
        return "Film{" + "idFilm=" + idFilm + ", idGenre=" + idGenre + ", titreFilm=" + titreFilm + ", titreOriginalFilm=" + titreOriginalFilm + ", totalEntreesFilm=" + totalEntreesFilm + ", dateSortieFilm=" + dateSortieFilm + ", entreeSemaineFilm=" + entreeSemaineFilm + ", nombreSemaineFilm=" + nombreSemaineFilm + ", anneefilm=" + anneefilm + ", dureeFilm=" + dureeFilm + ", condensefilm=" + condensefilm + ", couleursFilm=" + couleursFilm + ", interdictionFilm=" + interdictionFilm + ", publicFilm=" + publicFilm + '}';
    }
    
}
