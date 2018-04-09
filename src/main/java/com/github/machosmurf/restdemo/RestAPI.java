package com.github.machosmurf.restdemo;

import com.github.machosmurf.restdemo.administratie.Student;
import com.github.machosmurf.restdemo.administratie.StudentenAdministratie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestAPI {

    private StudentenAdministratie studentenAdministratie;

    @Autowired
    public RestAPI(StudentenAdministratie studentenAdministratie){
        this.studentenAdministratie = studentenAdministratie;
    }

    @RequestMapping(value = "/studenten/")
    public List<Student> allStudents(){
        return studentenAdministratie.getAll();
    }

}
