package org.javaCourse.OOPS.polymorphism.overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Addition add=new Addition();
        System.out.println(add.sum(3,4));
        System.out.println(add.sum(98,56,-1));
    }
}
