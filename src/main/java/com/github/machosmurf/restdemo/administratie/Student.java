package com.github.machosmurf.restdemo.administratie;

public class Student {

    static int nextStudentNummer = 1;
    private int studentNummer;
    private String voornaam;
    private String achternaam;

    public Student(String voornaam, String achternaam){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.studentNummer = nextStudentNummer;
        nextStudentNummer++;
    }
}
