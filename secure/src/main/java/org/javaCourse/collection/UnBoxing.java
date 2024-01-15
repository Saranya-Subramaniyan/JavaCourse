package org.javaCourse.collection;

import java.util.ArrayList;

//manually convert object into primitive data type
public class UnBoxing {
    public static void main(String[] args) {

        UnBoxing unBoxing=new UnBoxing();
        Integer n=unBoxing.add(100);
        int num=unBoxing.add(2);
//        unBoxing.add(num);
        System.out.println(num+" "+n);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
            System.out.println(list);
        }
    }
    public int add(Integer i){
        System.out.println(i+i);
        return i+i;
    }
}
