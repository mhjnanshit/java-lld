// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args){
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Anshit"); // In case of addition of an element , it increases its size by n = n + n/2 + 1

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,30); // Method Overloading

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(2));

        list.set(2,1000); // To change the value at a particular index
        list.clear();

        list.contains(500); // To check if list has this element
        list.get(3); // To access an element at an index , similar to list[i]

        // Iteration methods
        // For loop

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        // For each loop

        for(Integer el : list){
            System.out.println(el + " ");
        }

        // Iterator

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}
