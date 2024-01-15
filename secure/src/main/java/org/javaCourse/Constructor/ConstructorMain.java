package org.javaCourse.Constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Student student=new Student();
        student.setRegisterNo(334);
        student.setName("saran");
        student.setMark(92.0);
        System.out.println(student.getRegisterNo()+ " "+student.getName()+" "+ student.getMark());
        Student student1=new Student(333,"saru",94.9);
        System.out.println(student1.getRegisterNo()+ " "+student1.getName()+" "+ student1.getMark());
    }
}
