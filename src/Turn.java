public class Turn{
    private Player firstPlayer;
    private Player secondPlayer;
    private Board board;

    public Turn(Player firstPlayer, Player secondPlayer, Board board){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.board = board;
    }

    public void execute(){
        if(board.isWinner(firstPlayer.getPiece())) return;
        if(board.isWinner(secondPlayer.getPiece())) return;
        if(board.isFull()) return;

        playerTurn(firstPlayer);
        playerTurn(secondPlayer);
    }

    public void playerTurn(Player player){
        boolean isValid = false;
        do{
            board.paint();
            System.out.println(player.toString() + ". It is your turn");
            System.out.printf("X axis: \n");
            int x = Input.scan.nextInt();
            System.out.printf("Y axis: \n");
            int y = Input.scan.nextInt();
            Coordinate coord = new Coordinate(x, y);
            if(board.isMovementAvailable(coord)){
                board.putPiece(coord, player.getPiece());
                isValid = true;
            }
            System.out.println("Invalid coordinate! try again");
        // } while(!board.isMovementAvailable(coord));
        } while(!isValid);
    }
}
