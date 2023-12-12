package PExercises;
// there are 8 values in java (byte(-128 ti 127)(34), short(-32768 to 32767)(23000), int(-231 to 2'31-1)(45000), long(-2'63 to 2'63-1)(12345678901), float(3.2), double(438.840719112), chat(0 to 65535)('a'), boolean(true or false))
public class MainVariableArray {
    public static void main(String[] args){
        // byte b = 34;
        // short s = 23000;
        // int i = 45000;
        // long l = 12345678901L;//L is to say that is a long number
        
        // float f = 3.2f;
        // double d = 3.2232323232323232;

        // char c = 'a';
        // char c1 = 45;//not negative numbers
        
        // boolean b1 = true;

        //----Arimetic operators----
        // int x = 2;
        // int y = 3;
        // double x = 2;
        // double y = 3;
        // double z = x + y;

        // double d = x / y;
        // System.out.println(d);

        // int nr1 = 10;
        // int nr2 = 5;
        // int result = nr1 % nr2;
        // System.out.println(result);
        //----//----

        //assignment operators
        // int nr3 = 7;
        // int nr4 = 70;
        // nr3 += nr4;
        // nr3 -= nr4;
        // System.out.println(nr3);

        //Unary operators
        int nr5 = 8;
        nr5--;
        System.out.println(nr5);
    
        int nr6 = 3;
        System.out.println(-nr6);
        System.out.println(nr6);

        int pre = 5;
        int post = 5;
        System.out.println(++pre); // This gonna increase the value of the result
        System.out.println(post++);
        System.out.println("post: " + post + " pre: " + pre);

        //Relational Operators
        int small = 2;
        int big = 10;
        // System.out.println(small == big);
        System.out.println(small >= big);
    }

}
