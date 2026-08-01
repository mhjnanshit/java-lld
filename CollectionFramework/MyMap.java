import java.util.*;

public class MyMap {
    public static void main(String[] args){
        Map<String,Integer> mp = new HashMap<>();

        mp.put("A",1);
        mp.put("B",2);
        mp.put("C",3);
        mp.put("D",4);
        mp.put("E",5);

        // if(!mp.containsKey("B")){ To check if there is a key in map
        //     mp.put("B", 23);
        // }
        
        for(Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        for(String key : mp.keySet()){
            System.out.println(key);
        }
    }
}
