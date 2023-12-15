package Opp;

public class App {
    public static void main(String[] args){
        Dog dog = new Dog();//this is brining the animal instad say brining  the dog
        // Dog dog = new Dog();
        Cat cat = new Cat();
        
        // dog = new Cat();


        dog.eat();
        dog.eat("Meat");
        cat.eat();
        // dog.bark(); this is reconizing by animal
        // ((Dog) dog).bark();

        System.out.println(Dog.type);//Do not do it on the intance do it on the class
        System.out.println(Cat.type);

    }
}


//Overriding:Between parent and child class. Same method signature
//Overloading:Same class or parent class, same method name, different parameters
//Hiding:Static members with the same name in parents and child class

