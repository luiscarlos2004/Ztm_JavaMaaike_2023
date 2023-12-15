package GenericsandCollections;

public class Main {
    //This is safe
    public static void main(String[] args){
        Bag<Chihuahua> chihuahuBag = new Bag<>();
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.setName("Rocky");
        chihuahuBag.setContent(chihuahua);

        Bag<Laptop> laptopbag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("Lappie");

        laptopbag.setContent(laptop);
    }
    
}
