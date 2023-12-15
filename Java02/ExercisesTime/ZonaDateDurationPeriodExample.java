package ExercisesTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class ZonaDateDurationPeriodExample{
    public static void main(String[] args){
        ZonedDateTime overseasEvent = ZonedDateTime.of(2023, 11, 21, 10, 0, 0, 0 ,ZoneId.of("Asia/Kolkata"));
        System.out.println("Overseas event" + overseasEvent);

        //Duration between to Localtime objects
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration" + duration);

        //Period between to LocalDate objects
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDates = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDates);
        System.out.println("Period" + period);
    }
}