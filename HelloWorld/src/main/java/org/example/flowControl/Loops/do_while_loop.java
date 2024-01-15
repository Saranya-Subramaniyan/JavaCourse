package org.example.flowControl.Loops;

public class do_while_loop {
    public static void main(String[] args) {


        int digit = 1234, count = 0;
      do{
            count++;
            digit/=10;
        }  while (digit != 0);
        System.out.println(count);
    }
}
