public class Mainmethod {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Luis";
        person.age = 20;
        
        System.out.println("Name" + person.name);
        System.out.println("Age" + person.age);
    }
}

class Person{
    String name;
    int age;
}