package PExercises;
public class PersonPassObject {
    public static void main(String[] args){
        PersonThree person  = new PersonThree();
        person.name = "Carlos";
        person.age = 18;
        System.out.println("Name:" + person.name + "Age: " + person.age);
        modifyPerson(person);
        System.out.println("Name: " + person.name + "Age: " + person.age);
    }

    //This is a method
    public static void modifyPerson(PersonThree p){
        p.name  = "Cesar";
        p.age = 20;
    }

}


class PersonThree{
    String name;
    int age;
}
