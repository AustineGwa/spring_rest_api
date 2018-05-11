package com.gwazasoftwares.Services;

import com.gwazasoftwares.Model.Student;
import com.gwazasoftwares.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gwaza on 5/11/2018.
 */

@Service
public class StudentService {
   @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }
    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }
}
