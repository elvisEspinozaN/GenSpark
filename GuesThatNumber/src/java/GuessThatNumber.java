import java.util.Scanner;

public class GuessThatNumber {
    Scanner sc;
    String name;
    int randNum;
    int guessCount;

    public GuessThatNumber() {
        sc= new Scanner(System.in);
        randNum = (int)(Math.random()* 20+ 1);
        guessCount= 0;
    }

    public void setName() {
        System.out.println("Hello! What is your name?");
        name= getInp();
    }

    public boolean guess() {
        boolean invalid= true;
        int result= 0;
        System.out.println("Take a guess.");

        while(invalid) {
            try {
                result= Integer.parseInt(getInp());
                invalid= false;
            } catch(Exception e) {
                System.out.println("Invalid input : ( 1 - 20 )");
            }
        }
        if(result> randNum) {
            guessCount++;
            System.out.println("Your guess is too high.");
            return false;
        } else if(result< randNum) {
            guessCount++;
            System.out.println("You guess is too low.");
            return false;
        } else {
            guessCount++;
            System.out.println("Good job "+ name+ "! You guessed my number in "+ guessCount+ " guesses!");
            return true;
        }
    }

    public boolean replay() {
        System.out.println("Would you like to play again? (y or n)");
        if(getInp().equalsIgnoreCase("y")) {
            randNum = (int)Math.floor(Math.random()*(20) + 1);
            guessCount = 0;
            return true;
        } else {
            return false;
        }
    }

    private String getInp() {
        String inp;
        try {
            inp= sc.nextLine();
        } catch(Exception e) {
            inp= "err";
        }
        return inp;
    }
}
