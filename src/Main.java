public class Main{
    public static void main(String[] args){
        TicTacToe ttt = new TicTacToe();
        int response = 0;
        do{
            ttt.play();
            menu();
            response = Input.scan.nextInt();
        } while(response != 2);

    }

    public static void menu(){
        System.out.println("Select your option:");
        System.out.println("1. Play");
        System.out.println("2. Exit");
    }
}
