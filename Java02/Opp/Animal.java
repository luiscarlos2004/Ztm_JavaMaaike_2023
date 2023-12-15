//extends for the class
//Encapsulation is having private properties in the public getters and setters
//Abstraction:Allows for being able to use it without having to know the exact implementation(I know hor to use, but i do not need to know how it works)
//Polymorphins: Abily of class takes different forms

package Opp;

public class Animal{
    public static String type = "animal";
    // public String name;
    private String name;
    // public String age;
    private int age;
    // public int nrOfEyes;
    private int nrOfEyes;

    public void eat(){
        System.out.println("Animal eating");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
        
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public int getNString(){
        return nrOfEyes;
    }
}
