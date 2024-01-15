package org.javaCourse.collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueCollection {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<>();
        queue.add("hello");
        queue.add("world");
        queue.add("welcome");
        queue.add("hello");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.element()+" "+queue.peek()+" "+queue.poll());
        System.out.println(queue);
    }
}
