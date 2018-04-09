package com.github.machosmurf.restdemo.administratie;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentenAdministratie {

    private List<Student> studenten;

    public StudentenAdministratie(){
        studenten = new ArrayList<>();
        studenten.add(new Student("Frans", "Franssen"));
        studenten.add(new Student("Truusje", "Janssen"));
        studenten.add(new Student("Henk", "van Veen"));
    }

    public List<Student> getAll() {
        return this.studenten;
    }
}
