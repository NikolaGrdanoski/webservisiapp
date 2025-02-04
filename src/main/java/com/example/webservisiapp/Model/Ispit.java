package com.example.webservisiapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ispit")
public class Ispit {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "isp")
    private Sesija isp;

    @Column(name="predmet")
    private String predmet;

    @Column(name="kol")
    private int kol;

    @Column(name="datum")
    private String datum;

    @Column(name="vreme")
    private String vreme;

    @Column(name="godina")
    private String godina;

    @Column(name="semestar")
    private int semestar;

    @Column(name="prostorija")
    private String prostorija;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sesija getIsp() {
        return isp;
    }

    public void setIsp(Sesija isp) {
        this.isp = isp;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }


    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public String getProstorija() {
        return prostorija;
    }

    public void setProstorija(String prostorija) {
        this.prostorija = prostorija;
    }

    public String getStGod() {
        return godina;
    }

    public void setStGod(String godina) {
        this.godina = godina;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    } 
    
    public int getSem() {
        return semestar;
    }

    public void setSem(int semestar) {
        this.semestar = semestar;
    }

    public Ispit() {}

    public Ispit(int id, Sesija isp, String predmet, String datum, String vreme, String prostorija, String godina) {
        this.id = id;
        this.isp = isp;
        this.predmet = predmet;
        this.datum = datum;
        this.vreme = vreme;
        this.prostorija = prostorija;
        this.godina = godina;
    }

    @Override
    public String toString() {
        return "Ispit [id = " + id + ", isp = " + isp + ", predmet = " + predmet + ", datum = " + datum + ", vreme = " + vreme
                + ", prostorija = " + prostorija + ", studiskaGodina = " + godina + "]";
    }

    
}