package org.javaCourse.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Saranya","saan","swathi","sruthi");

        List<Student> students=new ArrayList<>();
//        for(String name:names)
//            students.add(new Student(name));
//
//        System.out.println(students);


        //use stream api
        students=names.stream().map(name->new Student(name)).toList();
//constructor reference
        students=names.stream().map(Student::new).toList();

        System.out.println(students);

    }

}
