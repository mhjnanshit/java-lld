import java.util.*;

public class MySet { // Not equivalent to set in cpp (Does not store in sorted order)
    public static void main(String[] args){
        Set<Integer> st = new HashSet<>();
        // Set<Integer> st = new LinkedHashSet<>(); (Here, we get the same order in which we inserted)

        st.add(32);
        st.add(22);
        st.add(12);

        System.out.println(st);

        st.remove(32);

        st.contains(33); // (true / false)
        st.isEmpty();
    }
}
