package EnumsExerciceOne;


public class BasicEnumExample {
    public static void main(String[] args){
        for(Weekday day : Weekday.values() ){
            System.out.println(day);
        }
    }
}
