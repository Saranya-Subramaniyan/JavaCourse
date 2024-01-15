package org.javaCourse.exceptionHandling;

public class Throw {
    public static void main(String[] args) throws Exception {
        Throw th=new Throw();
 th.task();
    }
    public void task() throws Exception {
        String x="zero";
        if(x.equals("zero")){
            throw new Exception("the x is zero");
        }
        else{
            System.out.println("done!!");
        }
    }
}
