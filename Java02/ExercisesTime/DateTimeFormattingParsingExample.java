package ExercisesTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args){
        LocalDateTime locadatetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
        String formattedDateTime = locadatetime.format(formatter);
        System.out.println("Formatted data and time" + formattedDateTime);

        //Parse a data string into a LocalStorage Object
        String dateString = "2023-11-21";
        DateTimeFormatter datFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate pasedDate = LocalDate.parse(dateString, datFormatter);
        System.out.println("Parsed data" + pasedDate);
    }
}   
