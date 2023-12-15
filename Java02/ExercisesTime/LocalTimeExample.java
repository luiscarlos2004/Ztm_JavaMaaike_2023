package ExercisesTime;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalTimeExample{
    public static void main(String[] args){
        LocalTime mettingTime = LocalTime.of(14,30);
        System.out.println("MettingTime: "+mettingTime);
        LocalDateTime event = LocalDateTime.of(2023,11,21,18,0);
        System.out.println("Event data and time:" + event);
    }
}