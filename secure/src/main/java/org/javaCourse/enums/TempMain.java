package org.javaCourse.enums;

public class TempMain {
    public static void main(String[] args) {
        int t=10;
        if(t<50)
            System.out.println(Temp.LOW+" "+Temp.LOW.getI());
        else if(t<80)
            System.out.println(Temp.MEDIUM);
        else
            System.out.println(Temp.HIGH);
    }
}
