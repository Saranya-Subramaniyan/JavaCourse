package org.javaCourse.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamApi {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        Random random=new Random();

        for(int i=1;i<=10_000;i++){
            nums.add( random.nextInt(100));
        }
        System.out.println(nums);

        int sum=nums.stream().map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(sum);

        //timer is different from stream and parallelstream ->parallelstream is faster

        long startTime=System.currentTimeMillis();
        int sum2=nums.stream().map(n->
                n*2).mapToInt(i->i).sum();
        long endTime=System.currentTimeMillis();
        System.out.println(sum2+" total time for stream "+(endTime-startTime));

        long start=System.currentTimeMillis();
        int sum3=nums.parallelStream().map(n->n*2).mapToInt(i->i).sum();
        long end=System.currentTimeMillis();
        System.out.println(sum3+" total time for parallel stream "+(end-start));
    }
}
