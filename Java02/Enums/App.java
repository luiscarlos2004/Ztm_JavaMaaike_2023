package Enums;

public class App{
    public static void main(String[] args){
        DayOfWeek  day = DayOfWeek.SUNDAY;
        DayOfWeek day2 = DayOfWeek.FRIDAY;

        if(day == day2){
            System.out.println("The same day");
        }else{
            System.out.println("Not the same day");
        }

        //prints the last position
        System.out.println(day.ordinal());
    }
}