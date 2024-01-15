package org.javaCourse.MultiThread;

import static java.lang.Thread.sleep;

public class AnonymousConcurrency {
    public static int counter =0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                   AnonymousConcurrency.counter++;
                }
                System.out.println("the loop in thread 1 is over");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    AnonymousConcurrency.counter++;
                }
                System.out.println("the loop in thread 2 is over");
            }
        }).start();
        sleep(200);
        System.out.println(counter);

    }
}
