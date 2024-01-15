package org.javaCourse.MultiThread;

import java.util.Random;

import static java.lang.Thread.sleep;

public class AnonymousThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try{
                        Random random=new Random();
                        sleep(random.nextInt(1000));
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(" iteration no: "+i);
                }
            }
        }).start();
    }
}
