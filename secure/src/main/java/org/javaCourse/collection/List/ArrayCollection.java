package org.javaCourse.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(890);
        list.add(100);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
