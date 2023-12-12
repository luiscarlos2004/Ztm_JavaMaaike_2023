package DControlFlowExercises;

public class Controlflowexercises {
    public static void main(String[] args){
        // int age = 5;
        // double ticketPrice;
        // if(age  < 5){
        //     // System.out.println("Free under the age of 5");
        //     ticketPrice = 0;
        // }else if(age < 12){
        //     // System.out.println("5 for the 5 - 12");
        //     ticketPrice = 5;
        // }else if(age < 18){
        //     // System.out.println("10 for the age 12 - 18");
        //     ticketPrice = 10;
        // }else{
        //     // System.out.println("15 for all other situtions");
        //     ticketPrice = 15;
        // }

        // System.out.println("Ticket price: $" + ticketPrice);

        //-----//-----

    //     char grade = 10;
    //     String comment;
    //     switch(grade){
    //         case 'A':
    //             comment = "Excellent!";
    //             break;
    //         case 'B':
    //             comment = "Good job!";
    //             break;
    //         case 6:
    //             comment = "Average.";
    //             break;
    //         case 4:
    //             comment = "Needs improvement";
    //             break;
    //         case 2:
    //             comment = "Failed. ";
    //             break;
    //         default:
    //             comment = "Invalid grade.";
    //     }

    //     System.out.println("Commment: " + comment);
    // }

    //-----//-----
        // int[] numbers = {4, 7, 12, 5, 8};
        // for(int i = 0; i <= numbers.length; i++){
        //     System.out.println("Values at index" + i + ": " + numbers[i]);
        // }
    //-----//-----
        // int n = 10;
        // int counter = 0;
        // int i = 0;

        // while( counter < n){
        //     if (i % 2 == 0){
        //         System.out.println(i);
        //         counter++;
        //     }   
        //     i++;
        // }

        //-----//-----
        // int n = 10;
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while( i < n);

        //-----//-----
        // int[] numbers = {2,5,3,6,9};
        // int sum = 0;
        // for (int i : numbers) {
        //     sum += i;
        // }
        // System.out.println(sum);

        //-----//-----
        // int[] gradestwo = {12,34,50,80,65};
        // int highest = 0;
        // int lowest = 0;
        // for(int i = 0; i <= gradestwo.length; i++){
        //     if(gradestwo[i] > highest){
        //         highest = gradestwo[i];
        //     }else if(gradestwo[i] < lowest){
        //         lowest = gradestwo[i];
        //     }
        // }
        // System.out.println("Highest values" + highest);
        // System.out.println("Lowest value" + lowest);

        //-----//-----
        int[] numbers = {10,20,15,25,20};
        int sum = 0;
        int count = 0;
        for(int number : numbers){
            if(number % 2 != 0){
                sum += number;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Average of odd numbers: " + average);
    }
}