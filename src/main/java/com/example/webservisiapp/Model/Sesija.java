package com.example.webservisiapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ispitna")
public class Sesija {
    @Id
    @Column(name="ID") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="studiska")
    private String studiska;


    @Column(name="BrSesija")
    private String BrSesija;

    public Sesija() {
    }

    public Sesija(int iD, String BrSesija, String studiska) {
        id = iD;
        this.BrSesija = BrSesija;
        this.studiska = studiska;
    }

    public int getID() {
        return id;
    }

    public void setID(int iD) {
        id = iD;
    }

    public String getStudiska() {
        return studiska;
    }

    public void setStudiska(String studiska) {
        this.studiska = studiska;
    }

    public String getBrSesija() {
        return BrSesija;
    }

    public void setBrSesija(String BrSesija) {
        this.BrSesija = BrSesija;
    }

    @Override
    public String toString() {
        return "Ispitna [ID = " + id + ", BrSesija = " + BrSesija + ", studiska = "+ studiska +"]";
    }
    

}
