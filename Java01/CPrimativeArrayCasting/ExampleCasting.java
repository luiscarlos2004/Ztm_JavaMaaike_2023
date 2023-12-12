package CPrimativeArrayCasting;
public class ExampleCasting {
    //Casting
    //There are two type of casting
    //Widening type casting / Narrowing type casting
    //Widening type casting Java can do this automatically for you. there is no risk of the value not fitting in the new type
    
    public static void main(String[] args){
        long l = 123;
        int x = (int) l;
        
        double d = 3.2;
        float f = (float) d;

        //this will be a problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = c;
        System.out.println(i);

        char maxChar = 65535;
        char newChar = (char) (maxChar + 1);
        System.out.println((int)newChar);
        String[] fruits =  {"oranges", "apple", "grapefruit"};
        String firstFruit = fruits[0];
        System.out.println(firstFruit);
        int[] intArr = new int[5];
        System.out.println(intArr[0]);
        intArr[0] = 2;
        System.out.println(intArr[0]);
        System.out.println(intArr.length);
        //Array to store different values in one variable
        //primitive int, boolean and float
        //primitives are simple data type represents a single value
        //primitives start with lowerletter at the bigining
        //compare using equals() method(this is to compare string in java)
    }
}
