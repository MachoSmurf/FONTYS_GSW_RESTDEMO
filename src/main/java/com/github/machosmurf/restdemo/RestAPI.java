package com.github.machosmurf.restdemo;

import com.github.machosmurf.restdemo.administratie.Student;
import com.github.machosmurf.restdemo.administratie.StudentenAdministratie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/studenten/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentenAdministratie.findStudentById(id);
    }

    @RequestMapping(value = "/studenten/{id}", method = RequestMethod.PUT)
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentenAdministratie.updateStudent(id, student);
    }

    @RequestMapping(value = "/studenten/", method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student){
        return studentenAdministratie.createStudent(student);
    }

    @RequestMapping(value = "/studenten/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id){
        studentenAdministratie.deleteStudent(id);
    }

}
