package Times;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class FormattingAndPassing {
    public static void main(String[] args){
       LocalDate now = LocalDate.now();
       LocalDateTime today = LocalDateTime.now();
        
       //Format with custom pattern
       DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    //    DateTimeFormatter dft = DateTimeFormatter.ofPattern("MMM/dd/yy");("MMMM/d/yy") this is another format like specifing the name of the month
       System.out.println(dft.format(now));
       System.out.println(dft.format(today)); 

       LocalDate ld = LocalDate.parse("February/20/21", dft);
       System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));

       DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
       DateTimeFormatter dtf1 = dtfb.appendLiteral("The data is:")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .toFormatter();

        System.out.println(dtf1);
    }
}
