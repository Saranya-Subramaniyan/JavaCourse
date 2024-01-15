package org.javaCourse.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) {
        Throws th=new Throws();

 try {
     th.task();
 }catch (FileNotFoundException fe){
     fe.printStackTrace();
 }
    }
    void task() throws FileNotFoundException {
        FileReader fileReader=new FileReader("test.txt");
        System.out.println("done!!!");
    }
}
