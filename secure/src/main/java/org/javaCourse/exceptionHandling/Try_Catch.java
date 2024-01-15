package org.javaCourse.exceptionHandling;

public class Try_Catch {
    public static void main(String[] args) {
    int y=10,x;
    try{
        y=y+10;
        x=y/0;
        System.out.println("no exception occur");
    }
    catch (Exception e) {
        System.out.println("the exception occur " + e);
    }
    finally {
        System.out.println(y);
    }
    }
}
