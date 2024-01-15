package org.javaCourse.MultiThread;

import static java.lang.Thread.sleep;

class MyCounter{
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe() throws InterruptedException {
        for(int i=0;i<10;i++){
            sleep(500);
            System.out.println("Thread no: "+threadNo+" and iteration no: "+i);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter=new MyCounter(1);
        MyCounter myCounter2=new MyCounter(2);
        long startTime=System.currentTimeMillis();

        myCounter.countMe();
        System.out.println("******************************");
        myCounter2.countMe();
        long endTime=System.currentTimeMillis();
        System.out.println(startTime+" "+endTime);
        long totalTime=endTime-startTime;
        System.out.println("total Time "+totalTime);

    }
}
