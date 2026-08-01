import java.util.*;

public class MyArraysClass {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(nums,4);
        System.out.println(index);

        Arrays.sort(nums);
    }
}
