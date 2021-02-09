import java.util.Scanner;

public class ControlMain {
    public static void main(String[] args) {

//        int[][] a = {
//                {1, 0, 0, 2, 0, 0, 0},
//                {1, 0, 0, 0, 0, 0, 0},
//                {1, 0, 0, 2, 0, 0, 0},
//                {1, 0, 0, 0, 0, 2, 2},
//                {1, 2, 2, 0, 2, 2, 0},
//                {1, 1, 2, 2, 2, 2, 2}
//        };
//
//        State state = new State(a);
//        int player1 = 1;
//        int upScore = 0;
//        int sideScore1 = 0;
//        int upDiagScore = 0;
//        int downDiagScore = 0;
//        int[][] newStateArray = state.getConnectBoard();
//
//        for (int i = 0; i < 3; i++) {
//            int temp = 0;
//
//            for (int j = 0; j < 7; j++) {
//                if(newStateArray[i][j] == player1){
//                    temp += 0;
//                }
//                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1){
//                    temp -= 4;
//                }
//                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1 && newStateArray[i + 2][j] == player1){
//                    temp -= 9;
//                }
//                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1 && newStateArray[i + 2][j] == player1 && newStateArray[i + 3][j] == player1){
//                    temp -= 999;
//                }
//                if(temp < sideScore1 ){
//                    sideScore1 = temp;
//                }
//                temp = 0 ;
//
//            }
//        }

//        System.out.println(sideScore1);


        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);

        
        State game =  new State(deneme);
        Minimax2H3 minimax2H3 = new Minimax2H3();

        AlphaBeta2H3 alphaBeta = new AlphaBeta2H3();

        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

//            State humanState = minimax2H3.minimaxSolve(9, 2, game );
          State humanState = alphaBeta.alphaBetaSolve(12, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
        }
    }

    public static void printBoard(int[][] board){
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }

    }

    public static boolean checkLines(int[][] board, int player){
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

    public static boolean makeMove(int[][] board, int column){
        if(column < 0 || column > 6){
            return false;
        }else{
            for (int i = 5; i >= 0; i--) {
                if(board[i][column] == 0){
                    board[i][column] = 1;
                    return true;
                }
            }
        }
        return false;
    }


}
