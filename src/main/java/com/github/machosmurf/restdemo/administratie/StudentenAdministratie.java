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

    public Student updateStudent(int id, Student student) {
        for (Student s : studenten){
            if (s.getStudentNummer() == id){
                if (student.getVoornaam() != null){
                    s.setVoornaam(student.getVoornaam());
                }
                if (student.getAchternaam() != null){
                    s.setAchternaam(student.getAchternaam());
                }
                return s;
            }
        }
        return null;
    }

    public Student createStudent(Student student) {
        //Student s = new Student(student.getVoornaam(), student.getAchternaam());
        studenten.add(student);
        return student;
    }

    public void deleteStudent(int id) {
        for (Student s : studenten){
            if (s.getStudentNummer() == id){
                studenten.remove(s);
            }
        }
    }

    public Student findStudentById(int id) {
        for (Student s : studenten){
            if (s.getStudentNummer() == id){
                return s;
            }
        }
        return null;
    }
}
