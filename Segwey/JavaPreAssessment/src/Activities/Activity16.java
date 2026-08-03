package Activities;

import java.util.Scanner;

public class Activity16 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int startingNumber = 0;

        for(int i = 1; i < number; i++){
            i = startingNumber;
            startingNumber++;
            System.out.println(startingNumber);
        }

    }
}
