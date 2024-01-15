package org.javaCourse.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("hello");
        queue.add("welcome");
        queue.add("haii");
        queue.add("saranya");
        System.out.println(queue);
    }
}
