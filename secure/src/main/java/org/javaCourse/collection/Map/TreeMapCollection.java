package org.javaCourse.collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
        Map<Integer,String> mapping=new TreeMap<>();
        mapping.put(1,"saranya");
        mapping.put(3,"swathi");
        mapping.put(2,"sanjay");
        mapping.put(4,"surthi");
        System.out.println(mapping);
        System.out.println(mapping.get(1));
        Iterator<Map.Entry<Integer,String>> iterator=mapping.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
