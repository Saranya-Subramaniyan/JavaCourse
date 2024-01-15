package org.javaCourse.streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,12,89,34,23,90);
        Stream<Integer> s1=list.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        //        s3.forEach(n-> System.out.println(n));
        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);


        //single stream -same operation
        List<Integer> arrayList= Arrays.asList(12,8,89,34,23,90);
        Stream<Integer> sortedValues=arrayList.stream().filter(n->n%2==0).map(n->n*2).sorted();

sortedValues.forEach(n-> System.out.println(n));




    }
}
