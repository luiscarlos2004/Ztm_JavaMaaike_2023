package InterfacesExercises;

public class Rectangle implements CreatingInterface,Countable{
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public void printInfo(){
        System.out.println("Rectangle infor");
    }
}