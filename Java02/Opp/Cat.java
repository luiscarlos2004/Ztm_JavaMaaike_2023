package Opp;

public class Cat extends Animal{

    public static String type = "Cat";

    @Override//this is a method and take to the object
    public void eat(){
        System.out.println("Cat is eating");
    }
}
