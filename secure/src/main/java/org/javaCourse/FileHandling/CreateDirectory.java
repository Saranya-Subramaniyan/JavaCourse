package org.javaCourse.FileHandling;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
       // File file =new File("folder");
//        System.out.println(file.mkdir());
        //single folder
        /*if(file.mkdir()){
            System.out.println("folder created");
        }
        else
            System.out.println("folder already exists");

        System.out.println(file.isDirectory());
        */
         //for subfolder

        File file =new File("folder\\subfolder\\fileHandling");
        if(file.mkdirs()){
            System.out.println("folder created");
        }
        else System.out.println("already exists");


        //check os
        String os=System.getProperty("os.name");
        System.out.println(os);
    }
}
