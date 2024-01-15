package org.example.solveQuestion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=1234,temp,sum=0;
        while(n!=0){
            temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.println("sum of the digits "+sum);
    }
}
