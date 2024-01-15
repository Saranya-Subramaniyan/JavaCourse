package org.javaCourse.Constructor;

public class Student {

    private int registerNo;
    private String name;
    private double mark;

    // default constructor
    public Student() {
    }

// parameterized constructor
    public Student(int registerNo, String name, double mark) {
        this.registerNo = registerNo;
        this.name = name;
        this.mark = mark;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
