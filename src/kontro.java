public class kontro {

        public static void main(String[] args){
            int [] [] deneme = new int[6][7];
            State game =  new State(deneme);



            AlphaBeta1H3 minimax1 = new AlphaBeta1H3();
//          Minimax2H3 minimax2 = new Minimax2H3();
            Minimax2H1 minimax2 = new Minimax2H1();

            boolean isEnded = true;

            while(isEnded){
                State humanState = minimax1.alphaBetaSolve(9, 1, game, Integer.MIN_VALUE, Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
                System.out.println("--------");
                if(checkLines(game.getConnectBoard(),1)){
                    isEnded = false;
                    System.out.println(" first ai won");
                    break;
                }
                State humanState1 = minimax2.minimaxSolve(1, 2, game);
                game.setConnectBoard(humanState1.getConnectBoard());
                printBoard(game.getConnectBoard());
                if(checkLines(game.getConnectBoard(),2)){
                    isEnded = false;
                    System.out.println("second ai won");
                    break;
                }
                System.out.println("--------");
            }
        }

        public static void printBoard(int[][] board){
            for (int i = 0; i < 6; i++) {
                System.out.print("|");
                for (int j = 0; j < 7; j++) {
                    System.out.printf("%4d|" , board[i][j]);
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
}
