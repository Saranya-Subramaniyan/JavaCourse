package org.javaCourse.Lambda;

interface Lambda{
    void demo();
//    void demo2(); only use one statement
//}
public class ThreadLambda {
    public static void main(String[] args) {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("statement 01");
//            }
//        });
        Thread thread=new Thread(()-> System.out.println("hello"));
        thread.start();
    }


    }
}
