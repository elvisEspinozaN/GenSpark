import java.util.Scanner;

public class DragonCave {
    Scanner sc= new Scanner(System.in);

    public String play() {
        String inp;
        System.out.println("You are in a land full of dragons. In front of you, \n" +
                "you see two caves, In one cave, the dragon is friendly \n" +
                "and will share his treasure with you. The other dragon \n" +
                "is greedy and hungry and will eat you on sight. \n" +
                "Which cave will you got into? (1 or 2)");

        inp= getInp();

        while(!inp.equals("1")&& !inp.equals("2")) {
            System.out.println("Invalid option : ( 1 or 2 )");
            inp= getInp();
        }

        return inp;
    }

    private String getInp() {
        String inp;

        try {
            inp= sc.nextLine();
        } catch(Exception err) {
            inp= "err";
        }
        return inp;
    }

    public String cave(String inp) {
        String ans;
        if(inp.equals("1")) {
            ans= "You approach the cave... \n" +
                    "It is dark and spooky... \n" +
                    "A large dragon jumps out in front of you! He opens his jaws and.. \n" +
                    "Gobbles you down in one bite!";
        } else {
            ans= "You approach the cave... \n" +
                    "It is dark and spooky... \n" +
                    "A large dragon jumps out in front of you! He opens his jaws and.. \n" +
                    "Shares all of his treasure!";
        }
        return ans;
    }


    public static void main(String[] args) {
        var obj= new DragonCave();
        String inp= obj.play();
        System.out.println(obj.cave(inp));
    }

}
