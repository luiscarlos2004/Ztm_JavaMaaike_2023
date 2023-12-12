package PExercises;
public class pruebaExercice {
    public static void main(String[] args ){
        int[] gradestwo = {12,34,50,80,65};
        int highest = gradestwo[0];
        int lowest = gradestwo[0];
        for(int i = 0; i < gradestwo.length; i++){
            if(gradestwo[i] > highest){
                highest = gradestwo[i];
            }else if(gradestwo[i] < lowest ){
                lowest = gradestwo[i];
            }
        }
        System.out.println("Highest values" + highest);
        System.out.println("Lowest value" + lowest);
    }
}
