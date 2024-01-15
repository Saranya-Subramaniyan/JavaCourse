package org.javaCourse.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Saranya","saan","swathi","sruthi");

        List<String> name=names.stream().map(n->n.toLowerCase()).toList();
        System.out.println(name);

        List<String> lowerName=names.stream().map(String::toUpperCase).toList();
        System.out.println(lowerName);
//        lowerName.forEach(m->System.out.println(m));

        lowerName.forEach(System.out::println);
    }
}
