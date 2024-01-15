package org.javaCourse.collection;

import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names>{
    String names;

    public Names(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Names{" +
                "names='" + names + '\'' +
                '}';
    }

    @Override
    public int compareTo(Names obj){
        if( names.length() == obj.names.length())
            return 0;
        else if ( names.length()> obj.names.length()) {
            return 1;
        }
        else
            return -1;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
     List<Names> name=new LinkedList<>();
     name.add(new Names("saranya"));
     name.add(new Names("surthi"));
     name.add(new Names("sanjay"));
     name.add(new Names("priya"));
        System.out.println(name);
        name.sort(null);
        System.out.println(name);
    }
}
