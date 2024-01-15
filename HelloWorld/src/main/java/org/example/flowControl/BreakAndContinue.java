package org.example.flowControl;

import java.sql.SQLOutput;

public class BreakAndContinue {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<10;i++){
            if(i==3)
            {
                System.out.println("skiping "+i);
                continue;
            }
            if(i==7){
                System.out.println("terminating with "+i);
                break;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
