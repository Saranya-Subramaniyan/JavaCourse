package org.javaCourse.OOPS.polymorphism.overloading;

public class Addition {

    int value1,value2,value3;
    public int sum(int value1,int value2) {
        return value1 + value2;
    }
    public int sum(int value1,int value2,int value3) {
        return value1 + value2+value3;
    }
}
