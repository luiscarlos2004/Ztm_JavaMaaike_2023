package GenericCollectionsExercises;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Luis",1);
        map.put("Carlos",2);
        map.put("Valdivieso", 3);

        for(Integer i : map.values()){
            System.out.println(i);
        }
        for(String i : map.keySet()){
            System.out.println(i);
        }
    }
    
}
