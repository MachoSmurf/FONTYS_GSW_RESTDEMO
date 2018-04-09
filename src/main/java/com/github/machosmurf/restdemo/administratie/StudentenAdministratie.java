package com.github.machosmurf.restdemo.administratie;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentenAdministratie {

    private List<Student> studenten;

    public StudentenAdministratie(){
        studenten = new ArrayList<>();
        studenten.add(new Student());
    }
}
