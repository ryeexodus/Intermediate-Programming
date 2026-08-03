package Activities;

import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Nested IF Statement"); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a Filipino citizen? (yes/no): ");
        String isFilipino = scanner.next();


        boolean filipinoCitizen; 


        if(isFilipino.equalsIgnoreCase("yes")) {
            filipinoCitizen = true; 
        } else if (isFilipino.equalsIgnoreCase("no")) {
            filipinoCitizen = false; 
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return; 
        }

    
        if (age >= 18) {
            if (filipinoCitizen) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote because you are not a Filipino citizen.");
            }
        } else {
            System.out.println("You are not eligible to vote because you are under 18 years old.");
        }
        


    }

}
