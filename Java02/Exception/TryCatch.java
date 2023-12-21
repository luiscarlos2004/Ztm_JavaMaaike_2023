package Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TryCatch {
    // public static void main(String[] args){
    //     //advantages intead crash the program the program keep executing
    //     try{
    //         File file = new File("Sample.txt");
    //         FileReader reader = new FileReader(file);
    //     }catch(FileNotFoundException e){
    //         System.out.println("File nor found");
    //     }finally{
    //         //this is always executable
    //         System.out.println("Always is executed");
    //     }
    //     System.out.println("Done");
    // }

    //-----//-----
    public static void main(String[] args){
        try (FileReader reader = new FileReader("Sample.txt")){

        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            //IOException needs to be second on the list
            System.out.println("IO problem");
        }
        System.out.println("Done!");
    }
}
