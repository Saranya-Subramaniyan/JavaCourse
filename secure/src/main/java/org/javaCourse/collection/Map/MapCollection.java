package org.javaCourse.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<Integer,String> mapping=new HashMap<>();
        mapping.put(1,"saranya");
        mapping.put(2,"sanjay");
        mapping.put(4,"surthi");
        System.out.println(mapping);
        System.out.println(mapping.get(1));
        System.out.println(mapping.containsValue("sanjay"));
        //display key
        for(Integer i: mapping.keySet()){
            System.out.println("Keys"+i+" values "+mapping.get(i));
        }
        //display values
        for(String str: mapping.values()){
            System.out.println(str);
        }

        Iterator<Map.Entry<Integer,String>> iterator=mapping.entrySet().iterator();
        while(iterator.hasNext()){
            //all entry
//            System.out.println(iterator.next());

            //single entry
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
