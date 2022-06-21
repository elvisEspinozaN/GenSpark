import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner exit= new Scanner(System.in); // a way to end do/while game loop
        Scanner nameInp= new Scanner(System.in); // take name input

        System.out.println("Hello what is your name?");
        String userName= nameInp.nextLine(); // assigns input to variable

        // loop to start game
        do {
            Random random= new Random(); // how to generate random number
            int randomNum = random.nextInt(20)+ 1; // variable randomNum with numbers 1 - 20
            System.out.println("Well, "+ userName+ ", I am thinking of a number between 1 and 20");

            // for loop to limit amount of guesses
            for (int guesses = 1; guesses <= 6; guesses++) {
                Scanner guessInp= new Scanner(System.in); // takes in input for the users guess
                int userGuess= guessInp.nextInt();

                if (userGuess == randomNum) {
                    System.out.println("Good job, "+ userName+ "! You guessed my number in "+ guesses+ " guesses!");
                    break;
                } else if (guesses == 6) {
                    System.out.println("You ran out of attempts! That actual answer was "+ randomNum);
                    break;
                }

                if (userGuess > randomNum) {
                    System.out.println("Your guess is too high. \nTake a guess.");
                } else {
                    System.out.println("Your guess is too low.\nTake a guess.");
                }
            }
            System.out.println("Would you like to play again? (y or n)");
        } while (!exit.nextLine().equals("n"));

    }
}