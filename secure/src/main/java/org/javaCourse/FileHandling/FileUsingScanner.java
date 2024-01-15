package org.javaCourse.FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileUsingScanner {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new File("src/fileWriter.txt"))){
            String line;
            while (sc.hasNext()){
                line=sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
