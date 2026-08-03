package Activities;

import java.util.Scanner;

public class Activity11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Logical AND (&&) Operator");

    System.out.print("Enter your average grade: ");
    double averageGrade = scanner.nextDouble();

    System.out.print("Enter your attendance percentage: ");
    double attendancePercentage = scanner.nextDouble();

    if(averageGrade >= 90 && attendancePercentage >= 95) {
        System.out.println("You are eligible for the scholarship.");
    } else {
        System.out.println("You are not eligible for the scholarship.");
        
    }

   }
}