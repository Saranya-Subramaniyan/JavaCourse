package org.javaCourse.collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(90);
        list.add(70);
        System.out.println(list);
        list.add(2,80);
        System.out.println(list);
        list.addFirst(110);
        list.addLast(60);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        System.out.println(list.remove(1)+" "+list+" " +
                ""+list.removeFirst()+" "+list.removeLast()+" \n"+list);
        Iterator<Integer> iterato=list.listIterator();
        while(iterato.hasNext()){
            System.out.println(iterato.next());
        }
    }
}
