import java.util.*;

public class MyPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(); // Min heap by default

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        Queue<Integer> Maxpq = new PriorityQueue<>(Comparator.reverseOrder()); // Max heap;

        Maxpq.offer(40);
        Maxpq.offer(12);
        Maxpq.offer(24);
        Maxpq.offer(36);

        System.out.println(Maxpq);
        Maxpq.poll();
        System.out.println(Maxpq);
        System.out.println(Maxpq.peek());
    }
}
