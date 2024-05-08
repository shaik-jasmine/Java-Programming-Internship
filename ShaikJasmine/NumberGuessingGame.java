import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;

        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                break;
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + secretNumber + ".");
                break;
            }
        }

        scanner.close();
    }
}
