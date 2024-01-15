package org.javaCourse.Lambda;

import java.util.*;

class Data{
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ComparatorLambda {
    public static void main(String[] args) {
        List<Data> list=new ArrayList<>();
        list.add(new Data("saranya"));
        list.add(new Data("swathi"));
        list.add(new Data("sruthi"));
        list.add(new Data("sanjay"));
        list.add(new Data("sadhu"));
        list.add(new Data("harsh"));
        Collections.sort(list, (o1,o2)->o1.getName().compareTo(o2.getName()));
        for(Data data:list){
            System.out.println(data);
        }
        System.out.println("*********************");
        Collections.sort(list, (o1,o2)->{
            if(o1.getName().length()<o2.getName().length())
                return -1;
            else if (o1.getName().length()>o2.getName().length())
                return 1;
            else return 0;
        });
        for(Data data:list){
            System.out.println(data);
        }
    }
}
