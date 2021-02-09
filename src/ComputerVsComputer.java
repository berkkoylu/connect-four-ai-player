import java.util.HashMap;

public class ComputerVsComputer {

    public static void aivsai(String firstAi, String secondAi, int firstDepth, int secondDepth, int firstSeed, int secondSeed){
        int [] [] deneme = new int[6][7];
        State game =  new State(deneme);
        Minimax1H1 minimax1H1 = new Minimax1H1();
        Minimax2H1 minimax2H1 = new Minimax2H1();
        Minimax1H2 minimax1H2 = new Minimax1H2();
        Minimax2H2 minimax2H2 = new Minimax2H2();
        Minimax1H3 minimax1H3 = new Minimax1H3();
        Minimax2H3 minimax2H3 = new Minimax2H3();
        AlphaBeta1H1 alphaBeta1H1 = new AlphaBeta1H1();
        AlphaBeta2H1 alphaBeta2H1 = new AlphaBeta2H1();
        AlphaBeta1H2 alphaBeta1H2 = new AlphaBeta1H2();
        AlphaBeta2H2 alphaBeta2H2 = new AlphaBeta2H2();
        AlphaBeta1H3 alphaBeta1H3 = new AlphaBeta1H3();
        AlphaBeta2H3 alphaBeta2H3 = new AlphaBeta2H3();

        Minimax1H2 minimax1 = new Minimax1H2();
        Minimax2H3 minimax2 = new Minimax2H3();

        boolean isEnded = true;

        while(isEnded){
            if(firstAi.equals("Minimax1H1")){
                State humanState = minimax1H1.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("Minimax2H1")){
                State humanState = minimax2H1.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("Minimax1H2")){
                State humanState = minimax1H2.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("Minimax2H2")){
                State humanState = minimax2H2.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("Minimax1H3")){
                State humanState = minimax1H3.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("Minimax2H3")){
                State humanState = minimax2H3.minimaxSolve(firstDepth, firstSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta1H1")){
                State humanState = alphaBeta1H1.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta2H1")){
                State humanState = alphaBeta2H1.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta1H2")){
                State humanState = alphaBeta1H2.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta2H2")){
                State humanState = alphaBeta2H2.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta1H3")){
                State humanState = alphaBeta1H3.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(firstAi.equals("AlphaBeta2H3")){
                State humanState = alphaBeta2H3.alphaBetaSolve(firstDepth, firstSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }

            System.out.println("--------");
            if(checkLines(game.getConnectBoard(),1)){
                isEnded = false;
                System.out.println(" first ai won");
                break;
            }
            if(secondAi.equals("Minimax1H1")){
                State humanState = minimax1H1.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("Minimax2H1")){
                State humanState = minimax2H1.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("Minimax1H2")){
                State humanState = minimax1H2.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("Minimax2H2")){
                State humanState = minimax2H2.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("Minimax1H3")){
                State humanState = minimax1H3.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("Minimax2H3")){
                State humanState = minimax2H3.minimaxSolve(secondDepth, secondSeed, game);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta1H1")){
                State humanState = alphaBeta1H1.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta2H1")){
                State humanState = alphaBeta2H1.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta1H2")){
                State humanState = alphaBeta1H2.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta2H2")){
                State humanState = alphaBeta2H2.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta1H3")){
                State humanState = alphaBeta1H3.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
            if(secondAi.equals("AlphaBeta2H3")){
                State humanState = alphaBeta2H3.alphaBetaSolve(secondDepth, secondSeed, game, Integer.MIN_VALUE,Integer.MAX_VALUE);
                game.setConnectBoard(humanState.getConnectBoard());
                printBoard(game.getConnectBoard());
            }
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
}
