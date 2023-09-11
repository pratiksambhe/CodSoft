import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        boolean playAgain = true;
        while(playAgain){
            int generatedNumber = r.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("--------------Welcome to the Number Guessing Game!--------------");
            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ".");

            int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts && !guessedCorrectly){
                System.out.println("Enter your guess:\n");
                int userGuess = s.nextInt();
                attempts++;

                if(userGuess == generatedNumber){
                    guessedCorrectly = true;
                    System.out.println("\nCongratulation! you guessed the number "+ generatedNumber+" correctly in "+attempts+" attempts");
                    score++;
                } else if (userGuess<generatedNumber) {
                    System.out.println("\nYour guess too low, Try again.");
                }else {
                    System.out.println("\nYour guess too high, Try again.");
                }
            }
            if (!guessedCorrectly){
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was: "+generatedNumber);
            }
            rounds++;
            System.out.println("Round "+rounds+" ended. Your current score: "+score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = s.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("Thank you for playing! Your final score: " + score);

    }
}