package Activities;

import java.util.Scanner;

public class Activity14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("While Loop (User Controlled) ");

        System.out.println("Please enter a positive integer: ");
        int positiveNumber = scanner.nextInt();

        int startingNumber = 1;

        System.out.println("Output: ");

        while(startingNumber <= positiveNumber){
            System.out.println(startingNumber);
            startingNumber++;
        }

    }
}
