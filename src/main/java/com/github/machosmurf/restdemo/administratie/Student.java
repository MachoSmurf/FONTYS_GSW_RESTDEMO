package com.github.machosmurf.restdemo.administratie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Student {

    static int nextStudentNummer = 0;
    private int studentNummer;
    private String voornaam;
    private String achternaam;
    private String wachtwoord;

    public Student(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.studentNummer = getNextStudentNummer();
        this.wachtwoord = "welkom123";
    }

    public static int getNextStudentNummer(){
        nextStudentNummer++;
        return nextStudentNummer;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam(){
        return achternaam;
    }

    public String getWachtwoord(){
        return wachtwoord;
    }
}
