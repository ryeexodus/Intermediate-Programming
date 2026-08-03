package Activities;

import java.util.Scanner;

public class Activity20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mixed Problem");

        System.out.print("How many students: ");
        int studentNum = scanner.nextInt();

        double[] studentGrade = new double[studentNum];

        for (int i = 0; i < studentNum; i++) {
            System.out.print("Input student grade " + (i + 1) + ": ");
            studentGrade[i] = scanner.nextDouble();
            System.out.println("Your grade: " + studentGrade[i]);
        }

            int passedCounter = 0;
            int failedCounter = 0;

            System.out.println("\n----------------------");

            for (double grade : studentGrade) {
                if (grade >= 90) {
                    System.out.println("Excellent!");
                    passedCounter++;
                } else if (grade >= 85) {
                    System.out.println("Very Good!");
                    passedCounter++;
                } else if (grade >= 80) {
                    System.out.println("Good!");
                    passedCounter++;
                } else if (grade >= 75) {
                    passedCounter++;
                    System.out.println("Fair!");
                } else {
                    System.out.println("Failed.");
                    failedCounter++;
                }
            }


            double total = 0;


        for(double grade : studentGrade){
            total += grade;
        }

        double classAverage = total/studentNum;

            System.out.println("\n----------------------");

            System.out.println("Number of Passed Students: " + passedCounter);
            System.out.println("Number of Failed Students: " + failedCounter);
            System.out.println("Class Average: " + classAverage);


        }
    }

