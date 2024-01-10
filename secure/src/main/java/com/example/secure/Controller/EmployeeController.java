package com.example.secure.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public String getEmployee(){
        return "employee";
    }
}
