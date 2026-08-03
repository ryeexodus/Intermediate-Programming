package Activities;

import java.util.*;

public class Activity7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple IF Statement Statement");

        int eligibleAge = 18;
        int userAge;

        System.out.print("Enter your age: ");
        userAge = scanner.nextInt();

        if(userAge >= eligibleAge) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


    
    }

}
