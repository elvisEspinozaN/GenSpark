import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, \n" +
                "you see two caves, In one cave, the sragon is friendly \n" +
                "and will share his treasure with you. The other dragon \n" +
                "is greedy and hungry and will eat you on sight. \n" +
                "Which cave will you got into? (1 or 2)");

        Scanner userInp= new Scanner(System.in);
        String inp= userInp.nextLine();

        // we can use a switch case since it's taking an input rather than an if/else:
        switch(inp) {
            case "1":
                System.out.println("You approach the cave... \n" +
                        "It is dark and spooky... \n" +
                        "A large dragon jumps out infront of you! He opens his jaws and.. \n" +
                        "Gobbles you down in one bite!");
                break;
            case "2":
                System.out.println("You approach the cave... \n" +
                        "It is dark and spooky... \n" +
                        "A large dragon jumps out infront of you! He opens his jaws and.. \n" +
                        "Shares all of his treasure!");
                break;
            default:
                System.out.println("Enter a valid choice!!!");
        }
    }
}
