import java.util.*;

public class MyStack {
    public static void main(String[] args){
        Stack<String> st = new Stack<>(); // push, pop, peek, size, isEmpty

        st.push("Cat");
        st.push("Dog");
        st.push("Horse");
        st.push("Lion");

        System.out.println(st.peek()); // To get the top element

        st.pop();

        System.out.println(st.peek());
    }
}
