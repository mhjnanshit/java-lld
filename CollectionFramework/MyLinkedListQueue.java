import java.util.*;

public class MyLinkedListQueue {
    public static void main(String[] args){
        Queue<Integer> qu = new LinkedList<>();

        qu.offer(12); // push
        qu.offer(24);
        qu.offer(36);

        System.out.println(qu);

        System.out.println(qu.poll()); // pop

        System.out.println(qu);

        System.out.println(qu.peek()); // front
    }
}
