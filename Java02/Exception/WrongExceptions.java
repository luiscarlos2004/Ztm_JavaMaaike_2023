package Exception;

import java.lang.reflect.Executable;

public class WrongExceptions extends Exception{
    //no args
    public WrongExceptions(){
        super();

    }

    //accepts a string message
    public WrongExceptions(String message){
        super(message);
    }
    //accepts another exception

    public WrongExceptions(Exception e){
        super(e);
    }
}
