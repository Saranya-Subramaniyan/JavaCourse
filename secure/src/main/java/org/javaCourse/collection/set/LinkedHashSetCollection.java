package org.javaCourse.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

//ordered and not allow duplicates
public class LinkedHashSetCollection {
    public static void main(String[] args) {
        Set<String> str=new LinkedHashSet<>();
        str.add("hello");
        str.add("welcome");
        str.add("saranya");
        str.add("saran");
        System.out.println(str);
        str.add("welcome");
        System.out.println(str);
        System.out.println(str.isEmpty());
        str.clear();
        System.out.println(str);
    }
}
