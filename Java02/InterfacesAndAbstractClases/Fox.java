package InterfacesAndAbstractClases;

public class Fox extends Mammal implements Predactor, Prey{
    
    @Override
    public void catchAndEat(){
        System.out.println("Fox is eating prey");
    }

    //Implementing run and hide method
    @Override
    public void runAndHide(){
        System.out.println("Running and hidding from predator");;
    }

    @Override
    public void run(){
        System.err.println("Fox is running");
    }
}
