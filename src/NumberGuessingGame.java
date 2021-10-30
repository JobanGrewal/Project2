import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int computerThoughtNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");
        boolean tryGuess = true;
        while (tryGuess) {
            System.out.println("Enter a number:");
            int guessedNumber = sc.nextInt();
            if (computerThoughtNumber == guessedNumber) {
                System.out.println("Congratulations you guessed right number");
                tryGuess=false;
            } else if (computerThoughtNumber > guessedNumber) {
                System.out.println("Your number is smaller than mine..try again..");
            } else {
                System.out.println("Your number is greater than mine..try again..");

            }

        }
        System.out.println("Number thought by computer is: " + computerThoughtNumber);
    }
}
