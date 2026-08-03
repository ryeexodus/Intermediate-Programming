package Activities;

import java.util.Scanner;

public class Activity12 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Logical OR ||");

        System.out.print("Purchase Amount: ");
        int purchaseAmount = scanner.nextInt();

        System.out.print("Is Member (true/false): ");
        boolean isMember = scanner.nextBoolean();

        if(purchaseAmount >= 1000 ||isMember ){
            System.out.println("You get a free shipping!");
            System.out.println("Thank you for your purchase");
        } else{
            System.out.println("Thank you for your purchase");
        }

    }
}
