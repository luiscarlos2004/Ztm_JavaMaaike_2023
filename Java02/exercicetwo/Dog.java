package exercicetwo;

public class Dog extends Animal {
    private String breed; 

    public Dog(String breed, String species, int age){//custom constructor
        super(species,age);
        this.breed = breed;
        System.out.println(species + age + breed);
    }
    public Dog(){//default constructor
        this("wow","animal",9);
    }
}
