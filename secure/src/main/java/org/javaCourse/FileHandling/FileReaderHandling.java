package org.javaCourse.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderHandling {
    public static void main(String[] args) {
        File file=new File("src//fileWriter.txt");
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("cannot read");
        }
    }
}
