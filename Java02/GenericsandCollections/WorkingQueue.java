package GenericsandCollections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

//core interface in add to the end  and delete from the front
public class WorkingQueue {
    public static void main(String[] args){
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C#");

        System.out.println(strings);
        strings.pop();
        System.out.println(strings);
        strings.addFirst("Java");
        strings.addLast("Rust");
        System.out.println(strings);
        System.out.println(strings.peek());
        System.out.println(strings);
        System.out.println(strings.pollLast());
        System.out.println(strings);
    }
}
