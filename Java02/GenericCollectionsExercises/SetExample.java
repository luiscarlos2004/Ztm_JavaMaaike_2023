package GenericCollectionsExercises;

import java.util.Set;
import java.util.HashSet;


public class SetExample{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
}