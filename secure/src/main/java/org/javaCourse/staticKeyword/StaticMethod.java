package org.javaCourse.staticKeyword;

class Student{
    String name;
    static String schoolName;
    public void show(){
        System.out.println(name+" "+schoolName);
    }
    public static void show1(){
        System.out.println(schoolName);
//        System.out.println(name+" "+schoolName);//error non-static variable cannot be used in static method
    }

    public static void show2(Student stu){
        System.out.println(stu.name+" "+schoolName);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="saranya";
        Student.schoolName="Kongu";
        student.show();
        Student.show1();
        Student.show2(student);

        Student student1=new Student();
        student1.name="sanjay";
        student1.show();
        Student.show1();
        Student.show2(student1);


    }
}
