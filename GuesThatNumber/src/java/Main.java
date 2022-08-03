public class Main {
    public static void main(String[] args) {
        var obj= new GuessThatNumber();
        obj.setName();
        boolean play= true;
        while(play) {
            boolean guess;
            do {
                guess= obj.guess();
            } while(!guess);
            play= obj.replay();
        }
    }
}