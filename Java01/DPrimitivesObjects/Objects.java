package DPrimitivesObjects;
public class Objects {
    public static void main(String[] args){
        Owner owner = new Owner();
        owner.name = "Luis";

        Car car = new Car();
        car.model = "Chevrolet";

        System.out.println("Owner" + owner.name);
        System.out.println("Car" + car.model);


    }
}

class Owner{
    String name;
}

class Car{
    String model;
    String owner;
}