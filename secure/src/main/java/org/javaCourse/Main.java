package org.javaCourse;

import org.javaCourse.OOPS.classAndObject.Car;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.speed=100;
        System.out.println(car.speed);
        car.speedCondition();
    }
}