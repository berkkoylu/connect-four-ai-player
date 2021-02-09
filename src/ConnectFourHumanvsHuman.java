import java.util.Scanner;

public class ConnectFourHumanvsHuman {


   public static void playHumanvsHuman()
   {

       Scanner input = new Scanner(System.in);
        char[][] board = new char[6][7];
        initializeBoard(board);
        printBoard(board);
        boolean isEnded = true;
        char player = '1'; // first player plays Red piece, other blue
        while(isEnded){

            int move = input.nextInt();
            boolean nextMove = makeMove(board,move - 1, player);

            if (nextMove){
                if(checkLines(board,player)){
                    isEnded = false;
                    System.out.println(player + " won");
                }
                if(player == '1' && isEnded){
                    player = '2';
                }else if (player == '2' && isEnded){
                    player = '1';
                }
            }else{
                System.out.println("You enter invalid column. Please play again");
            }
            printBoard(board);
            System.out.println("--------");
        }
    }





    public static void initializeBoard(char[][] board){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board){
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static boolean checkLines(char[][] board, char player){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if(board[i][j] == player &&
                board[i][j + 1] == player &&
                board[i][j + 2] == player &&
                board[i][j + 3] == player){
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if(board[i][j] == player &&
                        board[i + 1][j] == player &&
                        board[i + 2][j] == player &&
                        board[i + 3][j] == player){
                    return true;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if(board[i][j] == player &&
                        board[i - 1][j + 1] == player &&
                        board[i - 2][j + 2] == player &&
                        board[i - 3][j + 3] == player){
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(board[i][j] == player &&
                        board[i + 1][j + 1] == player &&
                        board[i + 2][j + 2] == player &&
                        board[i + 3][j + 3] == player){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean makeMove(char[][] board, int column, char player){
        if(column < 0 || column > 6){
            return false;
        }else{
            for (int i = 5; i >= 0; i--) {
                if(board[i][column] == ' '){
                    board[i][column] = player;
                    return true;
                }
            }
        }
        return false;
    }
}
