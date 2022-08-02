import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hangman {
    private Scanner sc;
    private static final String[] words= {"genpsark", "engineer", "jazz", "cat", "software", "engineer"};
    private ArrayList<Character> currentWord= new ArrayList<>();
    private ArrayList<Character> missedLetters= new ArrayList<>();
    private String theWord= "";
    private String name= "";
    private int gallows= 0;
    private int score= 0;
    boolean gameOver= false;

    void initial() {
        Scanner sc= new Scanner(System.in);
        this.sc= sc;
        System.out.println("Hi! Your goal is to guess the word before you run out of attempts.\nGoodluck!\nWhat is your name?");
        this.name= sc.next();
        int random= new Random().nextInt(words.length); // set random word
        theWord= words[random];
        currentWord= Stream.of(theWord.split("")) // hide the word to guess
                .map(x -> '_').collect(Collectors.toCollection(ArrayList::new));
    }

    void startGame() {
        displayGallows();
        displayGuessWord();
        displayMissedLetters();
        attemptGuess();
        if(roundDone()) {
            playAgain();
        }
    }

    boolean roundDone() {
        if(!currentWord.contains('_')) {
            System.out.println("You won.");
            return true;
        } else if(gallows== 5) {
            System.out.println("You lost.");
            return true;
        } else return false;
    }
    void playAgain() {
        System.out.println("You want to play again? (y/n)");
        Character inp= Character.toLowerCase(sc.next().charAt(0));
        if(inp.equals('y')) {
            int random= new Random().nextInt(words.length); // set random word
            theWord= words[random];
            currentWord= Stream.of(theWord.split("")) // hide the word to guess
                    .map(x -> '_').collect(Collectors.toCollection(ArrayList::new));
            missedLetters.clear();
            gallows= 0;
        } else if(inp.equals('n')) {
            gameOver= true;
        } else {
            System.out.println("Press a valid key!");
            playAgain();
        }
    }

    void displayGallows() {
        try {
            List<String> readlines= Files.readAllLines(Paths.get("src/java/gallows"+ gallows+ ".txt"));
            readlines.stream().peek(System.out::println).collect(Collectors.toList());
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
    void displayGuessWord() {
        currentWord.stream().peek(System.out::print).collect(Collectors.toList());
        System.out.println();
    }
    void displayMissedLetters() {
        if(missedLetters.isEmpty()) return;
        System.out.print("Missed Letters: ");
        missedLetters.stream().peek(x -> System.out.print(x+ " ")).collect(Collectors.toList());
        System.out.println();
    }
    void attemptGuess() {
        Character inp = Character.toLowerCase(sc.next().charAt(0));
        if (theWord.contains(String.valueOf(inp))) {
            IntStream.range(0, theWord.length()).mapToObj(i -> {
                if(theWord.charAt(i)== inp) {
                    currentWord.set(i, inp);
                }
                return i;
            }).collect(Collectors.toList());
        } else {
            if(missedLetters.contains(inp)) {
                System.out.println("You already tried "+ inp);
            } else {
                missedLetters.add(inp);
                gallows++;
            }
        }
    }

}
