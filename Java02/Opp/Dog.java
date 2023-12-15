package Opp;

public class Dog extends Animal{
    
    public static String type = "Dog";

    @Override // use the method when youre overriding
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void eat(String food){
        //This called overloueded method
        System.out.println("The Dog is eating " + food);
    }

    public void bark(){
        System.out.println("Woof woof");
    }
}
