package TextVariables;

public class ExampleString {
    public static void main(String[] args){
        String str = "Hi all!";
        //length counts all of characters
        int length = str.length();
        System.out.print(length);
        //charAt takes the string on the position sent
        System.out.println(str.charAt(0));
        //indexOf prints the position where start the argument
        System.out.println(str.indexOf("all"));
        //subString specific the number where start
        System.out.println(str.substring(3));
        //substring takes the information between those words
        System.out.println(str.substring(3, 5));
        //toLowerCase() toUpperCase() these methos change the format of the text 
        System.out.println(str.toUpperCase() + " " + str.toLowerCase());
        //trim() it cuts the spaces between the words
        String str1 = "    bla bla bla    ";
        System.out.println(str1.trim());
    }
}
