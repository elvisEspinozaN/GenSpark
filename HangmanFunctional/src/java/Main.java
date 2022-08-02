public class Main {
    public static void main(String[] args) {
        Hangman hm= new Hangman();
        hm.initial();
        while(!hm.gameOver) {
            hm.startGame();
        }
    }
}
