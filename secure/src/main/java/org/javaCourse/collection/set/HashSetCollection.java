package org.javaCourse.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

///not allow duplicate element and unordered
public class HashSetCollection {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        System.out.println(set.isEmpty());
        set.add("Saranya");
        set.add("hii");
        set.add("saran");
        set.add("hello");
        set.add("welcome");
        System.out.println(set);
        set.add("Saranya");
        System.out.println(set);
        System.out.println(set.isEmpty());
        for(String str:set){
            System.out.println(str);
        }

        //iterator
        Iterator<String> iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
