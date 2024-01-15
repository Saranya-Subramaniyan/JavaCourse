package org.javaCourse.array.method;

public class CallByReference {
    int data=10;

    public static void main(String[] args) {
        CallByReference callByReference=new CallByReference();
        System.out.println(callByReference.data);
        callByReference.display(callByReference);
        System.out.println(callByReference.data);


    }
    public void display(CallByReference call){
        call.data=100;
        System.out.println(call.data);
    }
}
