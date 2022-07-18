import java.util.*;

public class Land {
    Scanner sc= new Scanner(System.in);
    HashMap<Integer, String[]> board= new HashMap<>();
    Land(){}

    public void initBoard(){
        for (int i= 0; i< 10; i++){
            board.put(i, new String[]{" - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", " - ", "\n" });
        }
    }

    public void consoleBoard(int val){
        if (val== 1){
            System.out.println("Humans VS Goblins!\nSlay some Goblins\nMovements (n/s/e/w)");
        }

        for(Map.Entry<Integer, String[]> point : board.entrySet()){
            for(String i: point.getValue()){
                System.out.print(i);
            }
        }
    }

    public String[] setHuman(Human human, ArrayList<Goblin> goblin){
        String[] humanLocation= new String[2];
        String str= "";

        String combat= "0";
        int index= 0;

        for (int i= 0; i< goblin.size(); i++){
            if (goblin.get(i).getX_point()== human.getX_point()&& goblin.get(i).getY_point()== human.getY_point()){
                combat= "1";
                index= i;
            }
        }

        if (combat.charAt(0)== '1') {
            human.setHealth(human.getHealth()- randomizer(goblin.get(index).getStrength()));
            str= "You have slain "+ goblin.get(index).getName()+ "!";
            goblin.remove(index);
        }

        humanLocation[0]= combat;
        humanLocation[1]= str;

        return humanLocation;
    }

    public void setBoard(Human human, ArrayList<Goblin> goblin){
        initBoard();
        for(Map.Entry<Integer, String[]> x : board.entrySet()){

            for(int i= 0; i< goblin.size(); i++) { // updates goblins
                if (goblin.get(i).getX_point()== x.getKey()){
                    for (int j= 0; j< x.getValue().length- 1; j++){
                        if (goblin.get(i).getY_point()== j){
                            x.getValue()[j]= " G ";
                        }
                    }
                }
            }

            if (human.getX_point()== x.getKey()){ // updates human
                for (int i= 0; i< x.getValue().length- 1; i++){
                    if (human.getY_point()== i){
                        x.getValue()[i]= " H ";
                    }
                }
            }

        }
        consoleBoard(2);
    }

    public void getStats(Human human, ArrayList<Goblin> goblin){
        System.out.println(human.getName()+"'s health: "+ human.getHealth());
        System.out.println(human.getName()+"'s strength: "+ human.getStrength());
        System.out.println("Goblins: "+ goblin.size());
    }

    public String getGoblinName(){
        String[] goblinNames= new String[]{"one", "two", "three", "four"};
        int rand= new Random().nextInt(goblinNames.length);
        return goblinNames[rand];
    }

    public String getString(String str){
        String inp;
        System.out.print(str);
        inp= sc.nextLine();
        return inp;
    }

    public int randomizer(int range){
        if(range< 0){
            range= 1;
        }
        return new Random().nextInt(range);
    }

    @Override
    public String toString() {
        return "Land";
    }
}
