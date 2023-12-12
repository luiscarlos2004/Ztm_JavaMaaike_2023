package EcontrolFlow;
public class Whileloop {
    public static void main(String[] args){
        // int i = 0;
        // int count = 0;
        //This always checks the condition and then execute the instructions
        // while(i < 10){
        //     // System.out.println(Math.pow(i, 2));
        //     System.out.println("I is: " + i);
        //     i++;
        // }

        //dowhile execute before check the condition
        // do{
        //     count++;
        //     System.out.println("Count is: " + count);
        // }while (count < 10);

        //-----//-----
        // Scanner scanner = new Scanner(System.in);

        // String input;

        // do{
        //     System.out.println("Enter your name: ");
        //     //nextLine this is a metho witch used to read Srings
        //     input = scanner.nextLine();//This property is used to get user input
        // }while(input.length() < 2);

        //-----//-----
        //if the condition is true the code gonna execuete, the program continue executil until the program get false

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        //-----//-----
        // int[] nrs = {1,2,3,4,5,6,7,8,9,10};
        // int search = 7;
        // int index = -1;

        // for(int i = 0; i < nrs.length; i++){
        //     if(nrs[i] == search){
        //         index = i;
        //     }
        // }

        // System.out.println(index);

        //-----//-----
        // for(int row = 1; row <= 10; row++){
        //     for(int col = 1; col <= 10; col++){
        //         System.out.printf("%4d", row * col);
        //     }
        //     System.out.println();
        // }

        //-----//-----
        //Useful for itarating over collections or Arrays in a concise and readable way
        // String[] names = {"Supra", "Bob", "Fatiha"};
        // for(String name : names){
        //     System.out.println(name);
        // }
        //-----/Example ForEach/-----
        // int[] nrs = {0,1,2,3,4,5,6,7,8,9};
        // int sum = 0 ;
        // for(int nr : nrs){
        //     System.out.println(nr);
        //     sum += nr;
        // }
        // System.out.println("The sum is : " + sum);

        //-----/Break and Continue /-----
        // int[] nrs = {1,2,3,4,5,6,7,8,9,10};
        // int search = 7;
        // int index = -1;

        // for(int i = 0; i < nrs.length; i++){
            
        //     if(nrs[i] == search){
        //         index = i;
        //         // break;
        //         //skip the rest of the operation
        //     }

            
        // }

        // System.out.println(index);

        //-----/This is anoher example/-----
        int[] nrs = {0,1,2,3,4};
        for(int nr:nrs){
            if(nr % 2 == 0){
                continue;//this continue the process when the contnue match go back to the top
                //this is to control the flow of execution in loops
            }
            System.out.println(nr);
        }
    }   
}
