package DPrimitivesObjects;
// import PrimitivesObjects05.Person;
public class Pass {
    public static void main(String[] args){
        int i = 3;
        Person person = new Person();
        person.name = "Scott";
        changeStuff(i, person);
        System.out.println(i + " " + person.name);
    }

    public static void changeStuff(int x, Person person){
        x = 5;
        person.name = "Miley";
        System.out.println(person.name);
    }
}
