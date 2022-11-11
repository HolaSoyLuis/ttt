 public class Player{
     private String name;
     private Piece piece;

     public Player(String name, Piece piece){
         this.name = name;
         this.piece = piece;
     }

     public void setName(String name){
         this.name = name;
     }

     public void setPiece(Piece piece){
         this.piece = piece;
     }

     public String getName(){
         return name;
     }

     public Piece getPiece(){
         return piece;
     }

     @Override
     public String toString(){
         return "Player: " + name + " with piece " + piece;
     }

 }
