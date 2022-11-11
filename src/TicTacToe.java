import java.util.Random;

public class TicTacToe{
    private player firstPlayer;
    private Player secondPlayer;
    private Board board;
    private Turn turn;

    public TicTacToe(){
        firstPlayer = new Player();
        secondPlayer = new Player();
    }



    public void run(){
        System.out.println("Welcome =D (main menu)");
        System.out.println("First player enter your name");
        String firstPlayerName = Input.scan.nextLine();
        System.out.println("Second player enter your name");
        String secondPlayerName = Input.scan.nextLine();
    }

    public void play(){
        turn.execute();
    }

    public void showInfo(){
        System.out.println("Match information");
        board.getWinner();

}
