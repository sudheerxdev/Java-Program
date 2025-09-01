package DataStructure.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

class QueueDemo{
    public static void main(String[] args) {
        Queue<Integer>q = new PriorityQueue<>();
        q.add(12);
        q.add(32);
        q.add(22);
        q.add(42);
        System.out.println(q);
    }
}