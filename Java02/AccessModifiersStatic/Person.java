package AccessModifiersStatic;

public class Person {
    // public String name;
    protected String name; // in the same package is posible to acces, but different package gets an error

    private String secret;

    // public void sayHi(){
    //     System.out.println("Hello world");
    //     tellSecret();//if you call the private method on the main fille will print an error because it is private
    // }

    //Modified only has acces in the class is mosr strict than public
    //Default access modified inside the same package not problem
    //Default access modified less strict than the privated acces modified
    protected void sayHi(){
        System.out.println("Hello world");
        tellSecret();
    }
    private void tellSecret(){
        sayHi();
        System.out.println("The secret is " + secret);
    }


}
