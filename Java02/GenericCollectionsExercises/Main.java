package GenericCollectionsExercises;

public class Main {
    public static void main(String[] args){
        Box<Integer> box = new Box<>();    
        box.setContent(42);

        Box<String> boxString = new Box<>();
        boxString.setContent("Hello word!");
    }
}
