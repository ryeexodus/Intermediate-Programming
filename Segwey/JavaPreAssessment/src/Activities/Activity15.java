package Activities;

import java.util.Scanner;

public class Activity15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("While Loop with Computation");

        System.out.print("How many numbers you want to enter: ");
        int numberAmount = scanner.nextInt();

        int startingNumber = 1;
        int sum = 0;

        while(startingNumber <= numberAmount){
            System.out.println(startingNumber);
            sum += startingNumber;
            startingNumber++;

        }

        // 1 + 2 + 3 + 4 + 5 = 15

        System.out.println(sum);


    }
}
