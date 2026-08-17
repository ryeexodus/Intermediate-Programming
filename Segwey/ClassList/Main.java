package ClassList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Section Name: ");
        String sectionName = scanner.nextLine();

        ClassList classList = new ClassList(sectionName);

        System.out.print("How many students? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Student Number: ");
            String studentNumber = scanner.nextLine();

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            Student student =
                    new Student(studentNumber, name);

            classList.addStudent(student);
        }

        classList.displayClassList();

        scanner.close();
    }
}
