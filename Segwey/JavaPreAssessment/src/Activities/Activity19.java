package Activities;

import java.util.Scanner;

public class Activity19 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Odd and Even Counter");

        System.out.println("How many numbers: ");
        int numbers = scanner.nextInt();


        int oddCount = 0;
        int evenCount = 0;


        System.out.println("Even Numbers: ");
        for(int i = 0; i <= numbers; i+=2){
            System.out.print(i + " ");
        }

        System.out.println("\nOdd Numbers: ");
        for(int i = 1; i <=  numbers; i+=2){
            System.out.print(i + " ");
        }


       for (int i = 0; i < numbers; i++){
           if(i % 2 == 0){
               evenCount++;
           } else{
               oddCount++;
           }
       }

        System.out.println("\n-------------------------------");

        System.out.println("Even Numbers total: " + evenCount);
        System.out.println("Odd Numbers total: " + oddCount);





    }
}
