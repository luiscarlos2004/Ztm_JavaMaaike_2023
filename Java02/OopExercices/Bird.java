package OopExercices;

public class Bird extends Animal{
    public Bird(){
        super("Shirp");
    }
    @Override
    public void makeSound(){
        System.out.println("Bird sound" + getSound());
    }
}
