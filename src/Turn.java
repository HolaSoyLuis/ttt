public class Turn{
    private Player firstPlayer;
    private Player secondPlayer;
    private Board board;

    public Turn(Player firstPlayer, Player, secondPlayer, Board board){
        this.fisrtPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.board = board;
    }

    public void execute(){
        if(isWinner(firstPlayer) break;
        if(isWinner(secondPlayer) break;
        if(board.isFull()) break;

        playerTurn(firstPlayer);
        playerTurn(secondPlayer);
    }

    public void playerTurn(Player player){
        boolean isValid = false;
        do{
            board.paint();
            System.out.println(player.toString() + ". It is your turn");
            System.out.printf("X axis: \n");
            int x = input.nextInt();
            System.out.printf("Y axis: \n");
            int y = input.nextInt();
            Coordinate coor = new Coordinate(x, y);
            if(board.isMovementAvailable(coord)){
                board.putPiece(coord, Player.piece);
                isValid = true;
            }
            System.out.println("Invalid coordinate! try again");
        // } while(!board.isMovementAvailable(coord));
        } while(!isValid);
    }
}
