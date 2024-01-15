package org.javaCourse.generics;

import java.util.LinkedList;
import java.util.List;

class Data{
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return obj.toString();
    }
}
public class GenericsObject {
    public static void main(String[] args) {
  List<Data> list=new LinkedList<>();
  list.add(new Data("saranya"));
  list.add(new Data(19334));
        System.out.println(list);

    }
}
