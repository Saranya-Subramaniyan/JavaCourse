package org.javaCourse.array.method;

public class CallByValue {
    public static void main(String[] args) {
        int data=10;
        System.out.println(data);
        CallByValue callByValue=new CallByValue();
        callByValue.display(data);
        System.out.println(data);
    }
    public void display(int value){
        value=100;
        System.out.println(value);
    }
}
