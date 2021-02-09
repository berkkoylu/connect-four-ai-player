import java.util.List;

public class AlphaBeta2H3 implements MinimaxUtility {


    AlphaBeta2H3(){
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



        for (int i = 0; i < 6; i++) {
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                if(newStateArray[i][j] == player1){
                    temp += 0;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i][j + 1] == player1){
                    temp -= 5;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i][j + 1] == player1 && newStateArray[i][j + 2] == player1){
                    temp -= 20;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i][j + 1] == player1 && newStateArray[i][j + 2] == player1 && newStateArray[i][j + 3] == player1){
                    temp -= 1600;
                }
                if(temp < upScore1){
                    upScore1 = temp;
                }
                temp = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            int temp = 0;

            for (int j = 0; j < 7; j++) {
                if(newStateArray[i][j] == player1){
                    temp += 0;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1){
                    temp -= 5;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1 && newStateArray[i + 2][j] == player1){
                    temp -= 20;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i + 1][j] == player1 && newStateArray[i + 2][j] == player1 && newStateArray[i + 3][j] == player1){
                    temp -= 1600;
                }
                if(temp < sideScore1 ){
                    sideScore1 = temp;
                }
                temp = 0 ;

            }
        }

        for (int i = 3; i < 6; i++) {
            int temp = 0;
            for (int j = 0; j < 4; j++) {

                if(newStateArray[i][j] == player1){
                    temp += 0;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i - 1][j + 1] == player1){
                    temp -= 5;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i - 1][j + 1] == player1 && newStateArray[i - 2][j + 2] == player1){
                    temp -= 20;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i - 1][j + 1] == player1 && newStateArray[i - 2][j + 2] == player1 && newStateArray[i - 3][j + 3] == player1){
                    temp -= 1600;
                }
                if(temp < upDiagScore1){
                    upDiagScore1 = temp;
                }
                temp = 0 ;
            }
        }

        for (int i = 0; i < 3; i++) {
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                if(newStateArray[i][j] == player1){
                    temp += 0;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i+ 1][j + 1] == player1){
                    temp -= 5;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i+ 1][j + 1] == player1 && newStateArray[i + 2][j + 2] == player1){
                    temp -= 20;
                }
                if(newStateArray[i][j] == player1 && newStateArray[i+ 1][j + 1] == player1 && newStateArray[i + 2][j + 2] == player1 && newStateArray[i + 3][j + 3] == player1){
                    temp -= 1600;
                }
                if(temp < downDiagScore1){
                    downDiagScore1 = temp;
                }
                temp = 0 ;
            }
        }



        for (int i = 0; i < 6; i++) {
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                if(newStateArray[i][j] == player){
                    temp += 1;
                }
                if(newStateArray[i][j] == player && newStateArray[i][j + 1] == player){
                    temp += 6;
                }
                if(newStateArray[i][j] == player && newStateArray[i][j + 1] == player && newStateArray[i][j + 2] == player){
                    temp += 25;
                }
                if(newStateArray[i][j] == player && newStateArray[i][j + 1] == player && newStateArray[i][j + 2] == player && newStateArray[i][j + 3] == player){
                    temp += 1500;
                }
                if(temp > upScore){
                    upScore = temp;
                }
                temp = 0 ;
            }


        }
        for (int i = 0; i < 3; i++) {
            int temp = 0 ;
            for (int j = 0; j < 7; j++) {
                if (newStateArray[i][j] == player) {
                    temp += 1;
                }
                if (newStateArray[i][j] == player && newStateArray[i + 1][j] == player) {
                    temp  += 6;
                }
                if (newStateArray[i][j] == player && newStateArray[i + 1][j] == player && newStateArray[i + 2][j] == player) {
                    temp += 25;
                }
                if (newStateArray[i][j] == player && newStateArray[i + 1][j] == player && newStateArray[i + 2][j] == player && newStateArray[i + 3][j] == player) {
                    temp += 1500;
                }
                if(temp > sideScore){
                    sideScore = temp;
                }
                temp= 0;
            }


        }
        for (int i = 3; i < 6; i++) {
            int temp = 0 ;

            for (int j = 0; j < 4; j++) {

                if(newStateArray[i][j] == player){
                    temp += 1;
                }
                if(newStateArray[i][j] == player && newStateArray[i - 1][j + 1] == player){
                    temp += 6;
                }
                if(newStateArray[i][j] == player && newStateArray[i - 1][j + 1] == player && newStateArray[i - 2][j + 2] == player){
                    temp += 25;
                }
                if(newStateArray[i][j] == player && newStateArray[i - 1][j + 1] == player && newStateArray[i - 2][j + 2] == player && newStateArray[i - 3][j + 3] == player){
                    temp += 1500;
                }
                if(temp > upDiagScore){
                    upDiagScore = temp;
                }
                temp= 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            int temp = 0 ;

            for (int j = 0; j < 4; j++) {
                if(newStateArray[i][j] == player){
                    temp += 1;
                }
                if(newStateArray[i][j] == player && newStateArray[i+ 1][j + 1] == player){
                    temp += 6;
                }
                if(newStateArray[i][j] == player && newStateArray[i+ 1][j + 1] == player && newStateArray[i + 2][j + 2] == player){
                    temp += 25;
                }
                if(newStateArray[i][j] == player && newStateArray[i+ 1][j + 1] == player && newStateArray[i + 2][j + 2] == player && newStateArray[i + 3][j + 3] == player){
                    temp += 1500;
                }
                if(temp > downDiagScore){
                    downDiagScore = temp;
                }
                temp= 0;
            }
        }

        int playerScore1 = Math.min(Math.min(upScore1,upDiagScore1), Math.min(downDiagScore1,sideScore1));
        int absScore1 = Math.abs(playerScore1);

        int playerScore2 = Math.max(Math.max(upScore,upDiagScore), Math.max(downDiagScore,sideScore));

        if(absScore1 > playerScore2){
            state.setScore(playerScore1);
        }else{
            state.setScore(playerScore2);
        }



        return state;
    }

    // seed for player = 1 min
    // seed for computer = 2 max

    public State alphaBetaSolve(int depth, int playerSeed, State currentState, int alpha, int beta){
        int[][] newStateArray = currentState.getConnectBoard();


        if(newStateArray[5][3] == 0){
            newStateArray[5][3] = 2;
            State newState = new State(newStateArray);
            return newState;
        }
        // Oyun biterse ya da depth limit e ulasilirsa
        if( isGameOver(currentState) || depth == 0){
            // heuristic evaluation function
            return evaluate(currentState);

        }

        List<State> childrenOfState = generateChildren(currentState, playerSeed);

        int currentScore = 0;
        int bestScore = 0;
        State bestState = null;


        if(playerSeed == 2){
            bestScore = Integer.MIN_VALUE;
            for (State generatedState: childrenOfState) {
                State currentScoreState = alphaBetaSolve(depth - 1, 1, generatedState, alpha, beta);
                generatedState.setScore(currentScoreState.getScore());
                currentScore = currentScoreState.getScore();

                if (currentScore > bestScore) {
                    bestScore = currentScore;
                    bestState = generatedState;
                }
                alpha = Math.max(alpha, bestScore);
                if(beta <= alpha){
                    break;
                }
            }

            return bestState;


        }else {
            bestScore = Integer.MAX_VALUE;
            for (State generatedState : childrenOfState) {
                State currentScoreState = alphaBetaSolve(depth - 1, 2, generatedState, alpha, beta);
                generatedState.setScore(currentScoreState.getScore());
                currentScore = currentScoreState.getScore();

                if (currentScore < bestScore) {
                    bestScore = currentScore;
                    bestState = generatedState;
                }
                beta = Math.min(beta, bestScore);
                if (beta <= alpha) {
                    break;
                }

            }
            return bestState;

        }






    }



}

