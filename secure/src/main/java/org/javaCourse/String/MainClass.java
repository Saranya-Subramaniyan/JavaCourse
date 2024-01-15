package org.javaCourse.String;

public class MainClass {
    public static void main(String[] args) {
        String str=new String("hello");
        String str2="hello";
        String str3="hello";
        if(str2==str3)
            System.out.println("equal value and same reference");
        if(str.equals(str2))
            System.out.println("value equals");
        else
            System.out.println("value different");
        if(str == str2)
            System.out.println("equal value and same reference");
        else
            System.out.println("reference different or value different");

    }
}
