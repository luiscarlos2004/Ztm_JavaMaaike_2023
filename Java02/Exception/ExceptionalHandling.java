package Exception;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionalHandling {
    public static void main(String[] args) throws IOException{
        File file = new File("sample.txt");
        FileReader reader = new FileReader(file); 
        
    }
}
