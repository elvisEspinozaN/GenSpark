import java.util.*;

public class Hangman {
    String[] words= {"genspark", "software", "engineer", "jazz", "cat"};
    static Scanner ui= new Scanner(System.in);

    int attempt= 0;
    boolean gameDone= false;
    static boolean play= true;
    String wordToFind;

    List<Character> playerGuesses= new ArrayList<>();

    public static void main(String[] args) {
        Hangman hm= new Hangman();
        hm.play();
    }

    public void play() {
        wordToFind= getRandomWord();
        try{
            while(!gameDone) {
                System.out.println("H A N G M A N");
                printGallows(attempt);
                if(attempt>= 5) {
                    System.out.println("You lose");
                    System.out.printf("The word was: %s", wordToFind);
                    break;
                }
                printGuessingState(wordToFind, playerGuesses);
                if(!getPlayerInput(ui, wordToFind, playerGuesses)) {
                    attempt++;
                }
                if(printGuessingState(wordToFind, playerGuesses)) {
                    System.out.printf("\nYes! The secret word is \"%s\"! You have won!", wordToFind);
                    System.out.println("\nDo you want to play again? (yes or no)");
                    play= ui.nextLine().trim().equalsIgnoreCase("yes");
                    if(play) {
                        attempt= 0;
                        playerGuesses.clear();
                        wordToFind= getRandomWord();
                    } else {
                        break;
                    }
                }
            }
        } catch(Exception e) {
            throw new RuntimeException("Enter a LETTER");
        }
    }

    String getRandomWord() {
        Random rand= new Random(); // get random word from 'words arr'
        int randInt= rand.nextInt(words.length);
        return words[randInt];
    }

    private static boolean printGuessingState(String wordToFind, List<Character> playerGuesses) {
        int correctCount= 0;

        for(int i= 0; i< wordToFind.length(); i++) { // if user input matches a letter, insert into blank spaces
            if(playerGuesses.contains(wordToFind.charAt(i))) {
                System.out.print(wordToFind.charAt(i));
                correctCount++;
            } else {
                System.out.print("_ "); // if not leave blank spaces
            }
        }
        System.out.println();

        return (wordToFind.length()== correctCount); // return true if user is able to enter all correct letters
    }

    private static boolean getPlayerInput(Scanner ui, String wordToFind, List<Character> playerGuesses) {
        System.out.println("Guess a letter: ");
        String guessInput= ui.nextLine();
        playerGuesses.add(guessInput.charAt(0)); // takes the first letter of a user input

        return (wordToFind.contains(guessInput));
    }

    public static void printGallows(int attempt) {
        System.out.println("      _______");
        switch (attempt) {
            case 1:
                System.out.print(
                        "     |/      |\n" +
                                "     |      \n" +
                                "     |      \n" +
                                "     |       \n" +
                                "     |      \n");
                break;
            case 2:
                System.out.print("     |/      |\n"
                        + "     |       o \n"
                        + "     |      \n"
                        + "     |       \n"
                        + "     |      \n");
                break;
            case 3:
                System.out.print("     |/      |\n"
                        + "     |       o \n"
                        + "     |      \\|/\n"
                        + "     |       \n"
                        + "     |      \n");
                break;
            case 4:
                System.out.print("     |/      |\n"
                        + "     |       o \n"
                        + "     |      \\|/\n"
                        + "     |       |\n"
                        + "     |      \n");
                break;
            case 5:
                System.out.print("     |/      |\n"
                        + "     |       o \n"
                        + "     |      \\|/\n"
                        + "     |       |\n"
                        + "     |      / \\\n");
                break;
            default:
                System.out.print("     |/      \n"
                        + "     |      \n"
                        + "     |      \n"
                        + "     |       \n"
                        + "     |      \n");
                break;
        }
        System.out.println("     |");
        System.out.println(" ____|___");
    }

}
