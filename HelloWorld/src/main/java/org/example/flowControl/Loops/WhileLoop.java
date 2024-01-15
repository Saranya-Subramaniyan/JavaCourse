package org.example.flowControl.Loops;

public class WhileLoop {
    public static void main(String[] args) {


        int digit = 1234, count = 0;
        while (digit != 0) {
           count++;
           digit/=10;
        }
        System.out.println(count);
    }
}
