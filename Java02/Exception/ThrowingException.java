package Exception;

import java.io.IOException;//This is to check the exception
public class ThrowingException{
    public static void main(String[] args) throws IOException{
        // throw new Exception();
        divide(5, 0);
    }

    public static void divide(int a, int b) throws IOException{//needs this because it is handling(only specific the one you need becaue allow everything)
        if(b == 0){
            throw new IOException("Cannon divide by zerro");
        }
        System.out.println(a/b);
    }
}