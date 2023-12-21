package Exception;

public class App {
    public static void main(String[] args){
        try{
            print("Hello everybody!");
        }catch(WrongExceptions e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
        
    }

    public static void print(String s) throws WrongExceptions{
        if(s.length() < 11){
            System.out.println(s);
        }else{
            throw new WrongExceptions("The string is too long");
        }
    }
}
