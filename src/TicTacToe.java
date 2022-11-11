import java.util.Random;

public class TicTacToe{
    private Player firstPlayer;
    private Player secondPlayer;
    private Board board;
    private Turn turn;

    public TicTacToe(){
        firstPlayer = new Player();
        secondPlayer = new Player();
    }

    public void init(){
        System.out.println("Welcome =D (main menu)");
        System.out.println("First player enter your name");
        String firstPlayerName = Input.scan.nextLine();
        firstPlayer.setName(firstPlayerName);
        System.out.println("Second player enter your name");
        String secondPlayerName = Input.scan.nextLine();
        secondPlayer.setName(secondPlayerName);
    }

    public void play(){
        init();
        // turn.execute();
        showInfo();
    }

    public void showInfo(){
        System.out.println("Match information");
        board.getWinner();
    }

}
