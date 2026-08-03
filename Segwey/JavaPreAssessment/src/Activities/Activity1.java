package Activities;

import java.util.*; 
public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Year Level: ");
        int yearLevel = scanner.nextInt();


        System.out.println("\n---------------------------------");


        System.out.println("\nStudent Information");
        System.out.println("\nFull Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }

}
