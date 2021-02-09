import java.util.Scanner;

public class deneme {

    public static void humanVsAiminimax1H1(int depth, int algorithm,int playerSeed, Minimax1H1 minimax1H1){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);

        State game =  new State(deneme);

        boolean isEnded = true;

        while(isEnded){
            State humanState = minimax1H1.minimaxSolve(depth, playerSeed, game );
//          State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}
    public static void humanVsAiminimax2H1(int depth, int algorithm,int playerSeed, Minimax2H1 minimax2H1){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){

            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = minimax2H1.minimaxSolve(depth, playerSeed, game );
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAiminimax1H2(int depth, int algorithm,int playerSeed, Minimax1H2 minimax1H2){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        while(isEnded){
            State humanState = minimax1H2.minimaxSolve(depth, playerSeed, game );
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAiminimax2H2(int depth, int algorithm,int playerSeed, Minimax2H2 minimax2H2){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = minimax2H2.minimaxSolve(depth, playerSeed, game );
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}


    public static void humanVsAiminimax1H3(int depth, int algorithm,int playerSeed, Minimax1H3 minimax1H3){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;

        while(isEnded){
            State humanState = minimax1H3.minimaxSolve(depth, playerSeed, game );
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAiminimax2H3(int depth, int algorithm,int playerSeed, Minimax2H3 minimax2H3){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = minimax2H3.minimaxSolve(depth, playerSeed, game );
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}
    public static void humanVsAialphaBeta1H1(int depth, int algorithm,int playerSeed, AlphaBeta1H1 alphaBeta1H1){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;

        while(isEnded){
            State humanState = alphaBeta1H1.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}
    public static void humanVsAialphaBeta2H1(int depth, int algorithm,int playerSeed, AlphaBeta2H1 alphaBeta2H1){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = alphaBeta2H1.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}
    public static void humanVsAialphaBeta1H2(int depth, int algorithm,int playerSeed, AlphaBeta1H2 alphaBeta1H2){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;

        while(isEnded){
            State humanState = alphaBeta1H2.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAialphaBeta2H2(int depth, int algorithm,int playerSeed, AlphaBeta2H2 alphaBeta2H2){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = alphaBeta2H2.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }


            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAialphaBeta1H3(int depth, int algorithm,int playerSeed, AlphaBeta1H3 alphaBeta1H3){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;

        while(isEnded){
            State humanState = alphaBeta1H3.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            if(checkLines(game.getConnectBoard(), 1)){
                isEnded = false;
                System.out.println("computer won");
            }
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,2);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 2)){
                    //isEnded = false;
                    System.out.println("you won");
                    break;
                }
            }else{
                System.out.println("invalid column play again!!!");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}

    public static void humanVsAialphaBeta2H3(int depth, int algorithm,int playerSeed, AlphaBeta2H3 alphaBeta2H3){{
        int [] [] deneme = new int[6][7];
        Scanner input = new Scanner(System.in);
        State game =  new State(deneme);
        boolean isEnded = true;
        printBoard(game.getConnectBoard());
        while(isEnded){
            int move = input.nextInt();
            boolean nextMove = makeMove(game.getConnectBoard(), move - 1,1);
            if(nextMove){
                if(checkLines(game.getConnectBoard(), 1)){
                        //isEnded = false;
                    System.out.println("you won");
                    break;
                }
                }else{
                    System.out.println("invalid column play again!!!");
                }
            printBoard(game.getConnectBoard());
            System.out.println("--------------");
            State humanState = alphaBeta2H3.alphaBetaSolve(depth, playerSeed, game , Integer.MIN_VALUE,Integer.MAX_VALUE);
//           State humanState = alphaBeta.alphaBetaSolve(10, 2, game,Integer.MIN_VALUE, Integer.MAX_VALUE );
            game.setConnectBoard(humanState.getConnectBoard());
            if(checkLines(game.getConnectBoard(), 2)){
                isEnded = false;
                System.out.println("computer won");
            }

            printBoard(game.getConnectBoard());
            System.out.println("--------------");
        }

    }}



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

    public static boolean makeMove(int[][] board, int column, int player){
        if(column < 0 || column > 6){
            return false;
        }else{
            for (int i = 5; i >= 0; i--) {
                if(board[i][column] == 0){
                    board[i][column] = player;
                    return true;
                }
            }
        }
        return false;
    }

}