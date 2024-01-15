package org.javaCourse.String;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Saranya");
        System.out.println(str.capacity()+" "+str.length());
        str.append(" Saran");
        System.out.println(str+" "+str.length()+" "+str.capacity());
        String s1=str.toString();
        System.out.println(s1);
        str.deleteCharAt(2);
        System.out.println(str+" "+str.length()+" "+str.capacity());
        str.insert(7," welcome to study java and spring");
//        str.setLength(40);
        System.out.println(str+" "+str.length()+" "+str.capacity());
    }
}
