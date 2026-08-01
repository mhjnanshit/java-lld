import java.util.*;

public class MyArrayDeque {
    public static void main(String[] args){
        Deque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); // Add at last
        adq.offerFirst(12); // Add at start
        adq.offerLast(22); // Add at end
        adq.offer(122); // Add at end

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst()); // first element
        System.out.println(adq.peekLast()); // last element

        System.out.println(adq.pollFirst()); // Remove first element
        System.out.println(adq.pollLast()); // Remove last element

    }
}
