import java.util.List;

public class Minimax2H1 implements MinimaxUtility{

    private static int[][] calculationTable = {{1, 3, 5, 9, 5, 3, 1},
                                             {2, 4, 6, 10, 6, 4, 2},
                                             {3, 5, 7, 11, 7, 5, 3},
                                             {3, 5, 7, 11, 7, 5, 3},
                                             {2, 4, 6, 9, 6, 4, 2},
                                             {1, 3, 5, 8, 5, 3, 1}};


    public int evaluateScore(int[][] board) {
        int utilityScore = 100;
        int score = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == 2) {
                    score += calculationTable[i][j];
                } else if (board[i][j] == 1) {
                    score -= calculationTable[i][j];
                }
            }
        }
        return utilityScore + score;
    }


    public State evaluate(State state){
        int player = 2;
        int upScore = 0;
        int sideScore = 0;
        int upDiagScore = 0;
        int downDiagScore = 0;

        int player1 = 1;
        int upScore1 = 0;
        int sideScore1 = 0;
        int upDiagScore1 = 0;
        int downDiagScore1 = 0;


        int[][] newStateArray = state.getConnectBoard();
        int score = evaluateScore(newStateArray);
        state.setScore(score);



        return state;
    }


    // seed for player = 1 min
    // seed for computer = 2 max

    public State minimaxSolve(int depth, int playerSeed, State currentState){

        // Oyun biterse ya da depth limit e ulasilirsa
        if( isGameOver(currentState) || depth == 0){
            // heuristic evaluation function
            return evaluate(currentState);

        }

        List<State> childrenOfState = generateChildren(currentState, playerSeed);

        int currentScore = 0;
        int bestScore = 0;
        if(playerSeed == 2){
            bestScore = Integer.MIN_VALUE;
        }else{
            bestScore = Integer.MAX_VALUE;
        }


        State bestState = null;

        for (State generatedState: childrenOfState) {

            if (playerSeed == 2){
                State currentScoreState = minimaxSolve(depth - 1 , 1 , generatedState);
                generatedState.setScore(currentScoreState.getScore());
                currentScore = currentScoreState.getScore();
                if (currentScore > bestScore) {
                    bestScore = currentScore;
                    bestState = generatedState;
                }
            }else {
                State currentScoreState = minimaxSolve(depth - 1 , 2 , generatedState);
                generatedState.setScore(currentScoreState.getScore());
                currentScore = currentScoreState.getScore();
                if (currentScore < bestScore) {
                    bestScore = currentScore;
                    bestState = generatedState;

                }
            }

        }

        return bestState;

    }

}
