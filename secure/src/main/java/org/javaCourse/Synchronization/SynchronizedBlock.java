package org.javaCourse.Synchronization;

class SynchBlockBrackets{
     public void  generate() throws InterruptedException {
         synchronized (this) {
             for (int i = 1; i <= 20; i++) {
                 if (i <= 10)
                     System.out.print('[');
                 else
                     System.out.print(']');
             }
             System.out.println();
         }
     }
}
public class SynchronizedBlock {
    public static void main(String[] args){
        SynchBlockBrackets synchBlockBrackets=new SynchBlockBrackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try{
                        synchBlockBrackets.generate();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                long endTime=System.currentTimeMillis();
                System.out.println("time thread1 "+(endTime-startTime) );

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for(int i=0;i<5;i++){
                    try{
                        synchBlockBrackets.generate();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                long endTime=System.currentTimeMillis();
                System.out.println("time thread2 "+(endTime-startTime) );
            }
        }).start();
    }
}
