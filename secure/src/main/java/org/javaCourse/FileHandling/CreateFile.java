package org.javaCourse.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  throws IOException {
//        File file=new File("src/fileReader.txt");
        File file=new File("src\\fileWriter.txt");

        file.createNewFile();
        System.out.println("File Created");
    }
}
