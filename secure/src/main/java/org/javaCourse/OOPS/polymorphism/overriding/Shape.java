package org.javaCourse.OOPS.polymorphism.overriding;

public class Shape {
    int sides;

    public Shape(int sides) {
        this.sides = sides;
    }
}

class Triangle extends Shape {

    public Triangle(int sides) {
        super(sides);
    }

    void draw() {
        System.out.println("draw triangle " + sides);
    }
}

class Square extends Shape {
    public Square(int sides) {
        super(sides);
    }

    void draw() {
        System.out.println("draw square " + sides);
    }
}
