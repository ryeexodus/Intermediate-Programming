package Activities;

import java.util.*;

public class Activity6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System .in);
        System.out.println("Student Average Calculator");

        System.out.print("Enter grade for English subject: ");
        double englishGrade = scanner.nextDouble();
        System.out.print("Enter grade for Math subject: ");
        double mathGrade = scanner.nextDouble();
        System.out.print("Enter grade for Science subject: ");
        double scienceGrade = scanner.nextDouble();

        double average = (englishGrade + mathGrade + scienceGrade) / 3;

        System.out.println("The average grade is: " + average);

    }

}
