package Activities;

import java.util.*;

public class Activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Personal Biography");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your favorite food: ");
        String favoriteFood = scanner.nextLine();
        System.out.println("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();


        System.out.println("\nHello!");

        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I live at " + address + ".");
        System.out.println("My favorite food is " + favoriteFood + ".");
        System.out.println("My favorite color is " + favoriteColor + ".");
        
    }

}
