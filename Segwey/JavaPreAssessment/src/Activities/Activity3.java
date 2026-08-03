package Activities;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("\nStudent Information:");
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);

        
    }

}
