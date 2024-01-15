package org.javaCourse.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Saranya","saan","swathi","sruthi");
        Optional<String> name=names.stream().filter(str->str.contains("saran")).findFirst();
        System.out.println(name.orElse("Not found"));


        String n=names.stream().filter(str->str.contains("saran")).findFirst().orElse("Not Founnd");
        System.out.println(n);

    }
}
