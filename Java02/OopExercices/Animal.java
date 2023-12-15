package OopExercices;

public class Animal {
    private String sound;
    // sound = "Something";

    public Animal(String sound){
        setSound(sound);
    }
    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }
    public void makeSound(){
        System.out.println("Animal sound: " + getSound());
    }
}
