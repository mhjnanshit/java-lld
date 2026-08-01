import java.util.*;

public class MyCollectionsClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(33);
        list.add(23);
        list.add(63);
        list.add(343);
        list.add(3);
        list.add(323);
        list.add(3355);
            
        System.out.println(Collections.min(list)); // 3
        System.out.println(Collections.max(list)); // 3355
        System.out.println(Collections.frequency(list,33)); // 2

        Collections.sort(list); // Ascending
        Collections.sort(list, Comparator.reverseOrder()); // Decending
        // For custom comparator, implement comparable method
    }
}
