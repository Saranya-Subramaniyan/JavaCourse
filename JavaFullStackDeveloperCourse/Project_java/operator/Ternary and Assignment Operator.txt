package org.example.Operators;

public class TernaryAndLogical {
    public static void main(String[] args) {
        int val=10,val2=100;
        int greaterNo;
        greaterNo=val>val2?val:val2;
        System.out.println(greaterNo);
        //Assignment
        val+=10;
        System.out.println(val);
        val2/=10;
        System.out.println(val2);
        val*=2;
        System.out.println(val);
    }
}
