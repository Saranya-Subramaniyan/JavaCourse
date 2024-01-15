package com.spring.SpringMVC.service;

import com.spring.SpringMVC.Repo.CoderRepo;
import com.spring.SpringMVC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentInterface{

    @Autowired
    CoderRepo coderRepo;
    @Override
    public List<Student> getStudent() {
        return coderRepo.findAll();
    }

    @Override
    public void addStudent(Student student) {
        coderRepo.save(student);
        System.out.println("Added Student");
    }

    @Override
    public Student getByName(String name) {
        return coderRepo.findBySname(name);
    }

    @Override
    public List<Student> getByMark(int mark) {
        return coderRepo.findByMark(mark);
    }

    @Override
    public List<Student> getAllStudentByMarks() {
        return coderRepo.findAllByMarks();
    }
}
