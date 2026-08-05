/**
 * @Name: PRILLES, RYE EXODUS
 * @Classcode: 3042 ACT213L-OAa
 */

package Activities;

import java.util.Random;
import java.util.Scanner;

public class SimpleDiceGame {

    /*
    What we need:
    1. Ask for user to deposit money
    2. Ask for the user to add bet
    3. Validate the bet amount
    4. If valid, get the user guess - validate the guess
    5. Generate random number
    6. Compare user's guess and random generated number
    7. If matched, add the user's bet amount to the balance
    otherwise, subtract
    8. Show current balance
    9. Display if they want to play again
    10. Yes - ask for bet, No - Exit message,exit the program
     */

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(" ---=== Simple Dice Game ===--- ");

        double depositMoney;
        double balance;

        System.out.print("Deposit a money: ");
        depositMoney = scanner.nextDouble();
        System.out.printf("Your Starting Money: %.2f%n ", depositMoney);

        balance = storeMoney(depositMoney);

        boolean playAgain = true;


        do {
            double userBet = 0.00;
            System.out.println(">>><<<-------->>>>>>");
            System.out.print("Enter a Bet: ");
            userBet = scanner.nextDouble();
            boolean validBet = validateUserBetAmount(userBet,balance);

            if(validBet) { // If bet amount is valid, proceed to get the user's guess

                boolean isValid = false;

                do{ // Validation of Guess

                    int number = generateRandomNumber();
                    int guess;

                    System.out.print("Enter a guess (1-9): ");
                    guess = scanner.nextInt();

                    if (guess <= 0) {
                        System.out.println("You can't guess 0 or negative numbers");

                    } else if (guess > 9) {
                        System.out.println("Out of bounds!");

                    } else{
                        System.out.println("=======================");
                        System.out.println("User's Guess: " + guess);
                        System.out.println("Generated: " + number);
                        displayDice(number);
                        System.out.println("===============================");

                        if (guess == number) {
                            System.out.println(" +++ You have won: " + userBet+ " +++ ");
                            balance = balance + userBet;

                        }else{
                            System.out.println(" >>> You have lost: " + userBet+ " <<< ");
                            balance = balance - userBet;
                        }

                        System.out.println("---------------------------------");
                        System.out.printf("> Current Balance: %.2f%n",balance);
                        System.out.println("---------------------------------");

                        isValid = true; // If all true condition is met, exit

                    }
                }while(!isValid);

                scanner.nextLine(); // Buffer

                System.out.print("> Play Again? (Yes/No): ");
                String choice = scanner.nextLine().toLowerCase();

                switch (choice) {
                    case "no" -> playAgain = false;
                    case "yes" -> playAgain = true;
                    default -> System.out.println("Invalid");
                }

            } else{
                System.out.println("Invalid. Try Again!");
            }

        }while(playAgain);

        System.out.println();
        System.out.println("<--- Thank you for playing! --->");
        System.out.println();
        System.out.println("*********************************");
        System.out.printf("> Final Balance: %.2f%n", balance);
        System.out.printf("> Starting Balance: %.2f", depositMoney);
        System.out.println("\n*********************************");
        
    
    }

    public static double storeMoney(double depositMoney){

        double balance = 0.00;

        balance += depositMoney;

        return balance;
    }

    public static boolean validateUserBetAmount(double bet, double balance){

            if (bet > balance) {
                System.out.println("Insufficient funds.");
                return false;
            } else if (bet <= 0) {
                System.out.println("You can't bet negative amount or 0.");
                return false;
            }
            return true;
    }

    public static int generateRandomNumber(){

        int min = 1;
        int max = 9;

        return random.nextInt(min,max + 1);
    }

    public static void displayDice(int number){

        String dice1 = """
                  _______
                |         |
                |    ●    |
                |         |
                 _________
               """;

        String dice2 = """
                  _______
                | ●       |
                |         |
                |       ● |
                  _______
                """;

        String dice3 = """
                  ________
                | ●        |
                |    ●     |
                |        ● |
                  ________
                """;

        String dice4 = """
                  ________
                |  ●     ● |
                |          |
                | ●      ● |
                  ________
                """;

        String dice5 = """
                 ________
                | ●    ● |
                |   ●    |
                | ●    ● |
                 ________
                """;

        String dice6 = """
                 ________
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 ________
                """;

        String dice7 = """
                  ________
                | ●      ● |
                | ●   ●  ● |
                | ●      ● |
                  ________
                """;

        String dice8 = """
                  ________
                | ●   ●  ● |
                | ●   ●  ● |
                | ●      ● |
                  ________
                """;

        String dice9 = """
                  ________
                | ●   ●  ● |
                | ●   ●  ● |
                | ●   ●  ● |
                  ________
                """;

        switch(number){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            case 7 -> System.out.println(dice7);
            case 8 -> System.out.println(dice8);
            case 9 -> System.out.println(dice9);
            default -> System.out.println("Invalid");
        }
        
    }
}
