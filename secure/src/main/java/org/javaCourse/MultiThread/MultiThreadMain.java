package org.javaCourse.MultiThread;

import static java.lang.Thread.sleep;

class MyCounterMain  extends Thread {
    private int threadNo;

    public MyCounterMain(int threadNo) {
        this.threadNo = threadNo;
    }
 @Override
 public void run(){
try{
    countMe();
}
catch (InterruptedException e){
    e.printStackTrace();
}
 }
    public void countMe() throws InterruptedException {
        for(int i=0;i<10;i++){
            sleep(500);
            System.out.println("Thread no: "+threadNo+" and iteration no: "+i);
        }
    }
}
public class MultiThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyCounterMain myCounter=new MyCounterMain(1);
        MyCounterMain myCounter2=new MyCounterMain(2);
        long startTime=System.currentTimeMillis();
        myCounter.start();
        System.out.println("******************************");
        myCounter2.start();
        sleep(6000);
        long endTime=System.currentTimeMillis();
        System.out.println(startTime+" "+endTime);
        long totalTime=endTime-startTime;
        System.out.println("total Time "+totalTime);

    }
}
