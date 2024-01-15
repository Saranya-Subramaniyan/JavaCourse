package org.javaCourse.collection.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("saran");
        stack.push("sara");
        stack.push("sar");
        stack.push("sa");
        stack.push("s");
        System.out.println(stack+" "+stack.peek());
        System.out.println(stack.search("sar"));
        System.out.println(stack.pop());
        System.out.println(stack+" "+stack.empty()+" "+stack.isEmpty());
       stack.sort(null);
        System.out.println(stack);
        Collections.reverse(stack);
        System.out.println(stack);
        Iterator<String> iterator=stack.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(stack);
    }
}
