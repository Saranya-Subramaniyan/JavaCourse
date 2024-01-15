package org.javaCourse.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingOntoFiles {
    public static void main(String[] args) {
        try(BufferedWriter btr=new BufferedWriter(new FileWriter("src/fileWriter.txt"))){
            btr.write("hello everyone");
            btr.newLine();
            btr.write("hii");
            btr.newLine();
            btr.write("welcome");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }
}
