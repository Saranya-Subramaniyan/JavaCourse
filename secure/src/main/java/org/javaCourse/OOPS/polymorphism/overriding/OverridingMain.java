package org.javaCourse.OOPS.polymorphism.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(3);
        triangle.draw();
        Square square=new Square(4);
        square.draw();
    }
}
