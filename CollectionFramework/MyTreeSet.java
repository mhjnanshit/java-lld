import java.util.*;

public class MyTreeSet { // Equivalent to set in cpp (Stores in sorted order)
    public static void main(String[] args){
        Set<Integer> st = new TreeSet<>();
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