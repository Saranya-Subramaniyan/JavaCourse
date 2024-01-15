package org.javaCourse.innerClass;
class Outer{
    int age;
    public void show(){
        System.out.println("outer class");
    }
    class Inner{
        public void config(){
            System.out.println("inner class");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.show();
        Outer.Inner inner=outer.new Inner();
        inner.config();
    }
}
