package Activities;

import java.util.*;

public class Activity8 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Simple IF-ELSE Statement");

        double passingGrade = 75.0;
        double studentGrade;

        System.out.println("Enter your grade: ");
        studentGrade = scanner.nextDouble();

        if(studentGrade >= passingGrade) {
            System.out.println("Congratulations! You passed the course.");
        } else {
            System.out.println("Sorry, you did not pass the course. Better luck next time!");
        }




    
    }

}
