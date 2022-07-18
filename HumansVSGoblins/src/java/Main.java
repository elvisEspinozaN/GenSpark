import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String standIn;
        Land land= new Land();

        land.initBoard();
        land.consoleBoard(1);

        String name= land.getString("Type your name, please? ");
        Human human= new Human(land.randomizer(10), land.randomizer(10), 10, 5, name);

        ArrayList<Goblin> goblins = new ArrayList<>();
        for (int i= 0; i< 10; i++){
            goblins.add(new Goblin(land.randomizer(10), land.randomizer(10), land.randomizer(8), land.getGoblinName()));
        }

        boolean stillPlaying= true;
        do {
            land.setBoard(human, goblins);
            land.getStats(human, goblins);

            standIn = land.getString("Pick you next move: ");

            if (standIn.toLowerCase().charAt(0) == 'n' && human.getX_point() > 0){
                human.setX_point(human.getX_point() - 1);
            }
            if (standIn.toLowerCase().charAt(0) == 's' && human.getX_point() < 9){
                human.setX_point(human.getX_point() + 1);
            }
            if (standIn.toLowerCase().charAt(0) == 'w' && human.getY_point() > 0){
                human.setY_point(human.getY_point() - 1);
            }
            if (standIn.toLowerCase().charAt(0) == 'e' && human.getY_point() < 9){
                human.setY_point(human.getY_point() + 1);
            }

            String[] combat = land.setHuman(human, goblins); // check movements

            land.setBoard(human, goblins); // cycle through board
            land.getStats(human, goblins);

            switch(combat[0].charAt(0)) {
                case '1': {
                    System.out.println(combat[1]);
                    if(human.getHealth()< 1) {
                        System.out.println("You have died.");
                        stillPlaying= false;
                    }
                    break;
                }
                case '2': {
                    System.out.println(combat[1]);
                    break;
                }

            }

            if (goblins.size()<= 0){
                System.out.println("You have won.");
                stillPlaying= false;
            }

        } while(stillPlaying); // end of do loop

    }// end of main
}
