package InterfacesAndAbstractClases;

public interface Predactor {
    void catchAndEat();//it is public already
    default void eat(Prey p){
        System.out.println("Eating" + p.getClass().getName());
    }

    default void run(){
        System.out.println("Prey is running");
    }
}
