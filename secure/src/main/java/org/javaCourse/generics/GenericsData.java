package org.javaCourse.generics;

import java.util.LinkedList;
import java.util.List;

class MainData {
    private String name;

    public MainData(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class GenericsData {
    public static void main(String[] args) {
        List<MainData> list=new LinkedList<>();
        list.add(new MainData("saranya"));
        list.add(new MainData("hello"));
        System.out.println(list);
    }
}
