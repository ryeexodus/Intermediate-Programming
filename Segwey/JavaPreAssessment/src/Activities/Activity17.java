package Activities;

import java.util.Scanner;

public class Activity17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table");

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        int startingNumber = 1;
        int endingNumber = 10;
        int product;

        for(int i = 0; i <= endingNumber; i++ ){
            i = startingNumber;
            product = i * integer;
            System.out.println(integer +" * " + startingNumber++ + " = " +product);
        }

    }
}
