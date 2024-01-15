package org.javaCourse.FileHandling;

import java.io.File;

public class FileDeletionHandling {
    public static void main(String[] args) {
        File file=new File("src/fileReader.txt");
        if(file.delete()){
            System.out.println("File deleted");
        }
        else{
            System.out.println("File cannot be deleted");
        }
    }
}
