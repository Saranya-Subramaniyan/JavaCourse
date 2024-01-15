package org.javaCourse.MultiThread;

import java.util.Random;

import static java.lang.Thread.sleep;

class MyRunnable implements Runnable{
    private int threadNo;

    public MyRunnable(int threadNo) {
        this.threadNo = threadNo;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Random random=new Random();
                sleep(random.nextInt(1000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread no: "+threadNo+" iteration no: "+i);
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) throws InterruptedException{
      Thread thread1=new Thread(new MyRunnable(1));
        Thread thread2=new Thread(new MyRunnable(2));
        thread1.start();
        thread2.start();

    }
}
