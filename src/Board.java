public class Board{
    
    private final int BOARD_SIZE = 3;
    private Piece[][] pieces = new Piece[BOARD_SIZE][BOARD_SIZE];
    private Piece winner = Piece.EMPTY;

    public Board(){
        clearBoard();
    }

    public void clearBoard(){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                pieces[i][j] = Piece.EMPTY;
                winner = Piece.EMPTY;
            }
        }
    }

    public void paint(){
        for(int i = 0; i < BOARD_SIZE; i++){
            System.out.print("   " + i);
        }
        System.out.println();
        for(int i = 0; i < BOARD_SIZE; i++){
            System.out.print(i);
            for(int j = 0; j < BOARD_SIZE; j++){
                if(pieces[i][j] == Piece.X) System.out.print(" | " + "X");
                if(pieces[i][j] == Piece.O) System.out.print(" | " + "O");
                if(pieces[i][j] == Piece.EMPTY) System.out.print(" | " + " ");
            }
            System.out.println(" |");
        }
    }

    public boolean isFull(){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                if(pieces[i][j] == Piece.EMPTY)
                    return false;
            }
        }
        return true;
    }

    public boolean isMovementAvailable(Coordinate coord){
        if(pieces[coord.getX()][coord.getY()] == Piece.EMPTY)
            return true;
        return false;
    }
    
    public boolean horizontalWin(Piece piece){
        for(int i = 0; i < BOARD_SIZE; i++){
            int count = 0;
            for(int j = 0; j < BOARD_SIZE; j++){
                if(pieces[i][j] == piece)
                    count++;
            }
            if(count == BOARD_SIZE) return true;
        }
        return false;
    }
    

    public boolean verticalWin(Piece piece){
        for(int i = 0; i < BOARD_SIZE; i++){
            int count = 0;
            for(int j = 0; j < BOARD_SIZE; j++){
                if(pieces[j][i] == piece)
                    count++;
            }
            if(count == BOARD_SIZE) return true;
        }
        return false;
    }

    public boolean diagonalWin(Piece piece){
        int count = 0;
        for(int i = 0; i < BOARD_SIZE; i++){
            if(pieces[i][i] == piece)
                count++;
        }
        if(count == BOARD_SIZE) return true;
        else return false;
    }

    public boolean invertedDiagonalWin(Piece piece){
        int count = 0;
        for(int i = 0; i < BOARD_SIZE; i++){
            if(pieces[BOARD_SIZE - i][BOARD_SIZE - 1] == piece)
                count++;
        }
        if(count == BOARD_SIZE) return true;
        else return false;
    }

    public boolean isWinner(Piece piece){
        if(horizontalWin(piece) || verticalWin(piece) || diagonalWin(piece) || invertedDiagonalWin(piece))
            return true;
        return false;
    }

    /*
    public boolean putPiece(Coordinate coord, Piece piece){
        if(!isMovementAvailable(coord)){
            pieces[coord.getX()][coord.getY()] = piece;
            if(isWinner(piece)){
                winner = piece;
                return true;
            }
        }
        return false;
    }
    */

    public void putPiece(Coordinate coord, Piece piece){
        pieces[coord.getX()][coord.getY()] = piece;
        if(isWinner(piece)){
            winner = piece;
        }
    }

    public Piece getWinner(){
        return winner;
    }

}
