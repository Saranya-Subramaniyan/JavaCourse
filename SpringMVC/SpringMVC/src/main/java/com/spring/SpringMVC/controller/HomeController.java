package com.spring.SpringMVC.controller;

import com.spring.SpringMVC.LogFile.LoggingAspect;
import com.spring.SpringMVC.model.Student;
import com.spring.SpringMVC.service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    StudentInterface studentInterface;
    @Autowired
    LoggingAspect loggingAspect;

    @GetMapping(value = "/getStudent",produces = {"application/json"})
    public List<Student> getCoder(){
        loggingAspect.log();
      return studentInterface.getStudent();
  }

  @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
      studentInterface.addStudent(student);
  }

  @GetMapping("/getByName/{name}")
  public Student getByName(@PathVariable String name){
    return studentInterface.getByName(name);
  }
    @GetMapping("/getByMark/{mark}")
    public List<Student> getByMark(@PathVariable int mark){
        List<Student> student= studentInterface.getByMark(mark);
        System.out.println(student);
        return student;
    }

    @GetMapping("/getAllByMark")
    public List<Student> getAllStudentByMarks(){
        List<Student> student=studentInterface.getAllStudentByMarks() ;
        System.out.println(student);
        return student;
    }


//    @RequestMapping("/home")
//    public String home(){
//        System.out.println("home page requested");
//        return "web.html";
//    }
//    @RequestMapping("/add")
//    public int add(@RequestParam int num1,@RequestParam int num2){
//        return num1+num2;
//    }
//
//    @PostMapping("/addCoder")
//    public String addCoder(@RequestBody Coder coder){
//        return coder.toString();
//    }
//    @GetMapping("/getCoder")
//    public String getCoders(Model m){
//        List<Coder> coders= Arrays.asList(new Coder(1,"saranya"),new Coder(2,"surthi"));
//        m.addAttribute(coders);
//        return "showCoders.jsp";
//    }

}
