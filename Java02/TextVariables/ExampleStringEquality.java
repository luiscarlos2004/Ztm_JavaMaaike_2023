package TextVariables;

public class ExampleStringEquality {
    public static void main(String[] args){
        String s1 = "H1";
        //everything like this makes true
        // String s2 = "H1";
        //everything like this makes false
        String s2 = new String("H1");

        System.out.println(s1 == s2);
        //String pool
        //this is when you want to compare is this method for it
        System.out.println(s1.equals(s2));;
        
    }
}
