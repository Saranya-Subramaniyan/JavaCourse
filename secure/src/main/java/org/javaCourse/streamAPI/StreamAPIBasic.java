package org.javaCourse.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPIBasic {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,2,3);

    //stream api
        list.forEach(n-> System.out.println(n));

        //for each work
/*
        Consumer<Integer> nums=new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };



        //use lambda exp

        Consumer<Integer> nums=n->System.out.println(n);

                nums.forEach(n-> System.out.println(n));


 */

        int sum=0;
        for(int n:list){
           sum+= n%2==0?n*2:n*3;
        }
        System.out.println(sum);
    }
}
