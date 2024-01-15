package com.example.SpringBootAppBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {

    int age;
    private Laptop laptop;

    public Coder(Laptop laptop) {
        System.out.println("laptop");
        this.laptop = laptop;
        laptop.compile();
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        laptop.compile();
    }
}
