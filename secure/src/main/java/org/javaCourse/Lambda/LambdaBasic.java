package org.javaCourse.Lambda;
@FunctionalInterface
interface LambdaExp{
    public void demo();
}
public class LambdaBasic {
    public static void main(String[] args) {
        LambdaExp lambdaExp=()-> System.out.println("Statement 01");
        lambdaExp.demo();
    }
}
