package com.example.webservisiapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Kol")
public class Kol {
    @Id
    @Column(name="ID") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="studiska")
    private String studiska;

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

    @Column(name="red")
    private String red;

    public Kol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getStudiska() {
        return studiska;
    }

    public void setStudiska(String studiska) {
        this.studiska = studiska;
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

    public Integer getSem() {
        return semestar;
    }

    public void setSem(Integer semestar) {
        this.semestar = semestar;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }


    public Kol(int id, String studiska, Integer semestar, String predmet, String datum, String vreme, String prostorija, String red) {
        this.id = id;
        this.studiska = studiska;
        this.semestar = semestar;
        this.predmet = predmet;
        this.datum = datum;
        this.vreme = vreme;
        this.prostorija = prostorija;
        this.red = red;
    }

    @Override
    public String toString() {
        return "Kol [id = " + id + ", studiska = " + studiska + ", predmet = " + predmet + ", datum = " + datum + ", vreme = " + vreme
                + ", prostorija = " + prostorija +  ", semestar = " + semestar + ", red = " + red + "]";
    }

    

}
