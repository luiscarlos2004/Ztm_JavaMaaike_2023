package GenericCollectionsExercises;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args){
        Queue<Character> letters = new LinkedList<>();
        letters.add('C');
        letters.add('A');
        letters.add('D');
        letters.add('E');
        System.out.println(letters);
    }
}
