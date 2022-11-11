public class Put{
    public void putPiece(Player player, Board board, Coordinate coord){
        board.putPiece(coord, player.getPiece()); 
    }
}
