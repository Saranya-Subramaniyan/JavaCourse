package com.spring.SpringMVC.service;

import com.spring.SpringMVC.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentInterface {

    public List<Student> getStudent();


    void addStudent(Student student);
    Student getByName(String name);

    List<Student> getByMark(int mark);
    List<Student> getAllStudentByMarks();
}
