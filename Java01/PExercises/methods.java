package PExercises;
public class methods {
    //Methods
    //Public is accesible by everybody
    //void doesnt have a result just do somenthing
    //printMessage() namemethod need to call the method
    public void printMessage(String message){//when the method has void doesn't return, but it has a type could return something
        //This call method body
        System.out.println(message);
    }

    //This is only to return something
    public int add(int a){
        return a + 1;
    }

    int result = add(42);

}
