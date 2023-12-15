package InterfacesExercises;

public interface Countable {
    default void printInfo(){
        System.out.println("Print something");
    }
}
