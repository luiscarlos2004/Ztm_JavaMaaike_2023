package InterfacesExercises;

public interface CreatingInterface {
    void draw();
    default void erase(){
        System.out.println("Erasing the drawing");
    }
    
}
