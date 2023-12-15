package GenericCollectionsExercises.ExerciseBag;

public class BagExample {
    
    public static void main(String[] args){
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Banana");
        stringBag.addItem("Apple");
        stringBag.addItem("Grapes");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(2);
        integerBag.removeItem(1);

        System.out.println(integerBag.getItems());
        System.out.println(stringBag.getItems());

    }

    
}
