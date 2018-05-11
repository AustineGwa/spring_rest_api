package com.gwazasoftwares.Controllers;

import com.gwazasoftwares.Model.Student;
import com.gwazasoftwares.Repositories.StudentRepository;
import com.gwazasoftwares.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gwaza on 5/11/2018.
 */

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/allStudents")
    public List<Student>  getAllStudents(){
      return   studentService.getAllStudents();
    }

    @RequestMapping("/addStudent")
    public void addStudent(@RequestParam Student student){
        studentService.addStudent(student);
    }

    @RequestMapping("/deleteStudent")
    public void deleteStudent(@RequestParam Student student){
        studentService.deleteStudent(student);
    }
}
