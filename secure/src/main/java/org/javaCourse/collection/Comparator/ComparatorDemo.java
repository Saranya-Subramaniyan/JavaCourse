package org.javaCourse.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<String> com=(o1,o2)->{
                if(o1.length()>o2.length()) {
                    return 1;
                }
                else {
                    return -1;
                }
            };
        List<String> list=new ArrayList<>();
        list.add("sar");
        list.add("saranya");
        list.add("sara");
        list.add("saran");
        //sort based on array length
        Collections.sort(list,com);
        System.out.println(list);
    }
}
