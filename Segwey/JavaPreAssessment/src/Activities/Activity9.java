package Activities;

import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = 0.0;
        boolean tryAgain = true; 

        
        // Grade 

        while(tryAgain){
            System.out.print("Enter your grade: ");
            grade = scanner.nextDouble();


        if(grade >= 90) {
        System.out.println("Excellent!");
        } else if(grade >= 80) {
        System.out.println("Very Good!");
        } else if(grade >= 70) {
            System.out.println("Good!");
        } else if(grade >= 60) {
            System.out.println("Fair!");
        } else {
            System.out.println("Failed.");
        }

        System.out.print("Do you want to enter another grade? (yes/no): ");
        String response = scanner.next();

        if(response.equalsIgnoreCase("yes")) {
            tryAgain = true;
        } else {
            System.out.println("Thank you for using the grade evaluator!");
            tryAgain = false;
        } 
        
        }

    }
}