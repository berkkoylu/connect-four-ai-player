import java.util.List;

public class Minimax1H2 implements MinimaxUtility{


    public State evaluate(State state){
        int player = 1;
        int upScore = 0;
        int sideScore = 0;
        int upDiagScore = 0;
        int downDiagScore = 0;
        int[][] newStateArray = state.getConnectBoard();

        for (int i = 0; i < 6; i++) {
            int temp = 0;
            for (int j = 0; j < 4; j++) {
                if(newStateArray[i][j] == player){
                    temp += 1;
                }
                if(newStateArray[i][j] == player && newStateArray[i][j + 1] == player){
                    temp += 4;
                }
                if(newStateArray[i][j] == player && newStateArray[i][j + 1] == player && newStateArray[i][j + 2] == player){
                    temp += 9;
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
                    temp  += 4;
                }
                if (newStateArray[i][j] == player && newStateArray[i + 1][j] == player && newStateArray[i + 2][j] == player) {
                    temp += 9;
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
                    temp += 4;
                }
                if(newStateArray[i][j] == player && newStateArray[i - 1][j + 1] == player && newStateArray[i - 2][j + 2] == player){
                    temp += 9;
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
                    temp += 4;
                }
                if(newStateArray[i][j] == player && newStateArray[i+ 1][j + 1] == player && newStateArray[i + 2][j + 2] == player){
                    temp += 9;
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

        state.setScore(Math.max(Math.max(upScore,upDiagScore), Math.max(downDiagScore,sideScore)));



        return state;
    }


    // seed for player = 1 min
    // seed for computer = 2 max

    public State minimaxSolve(int depth, int playerSeed, State currentState){

        int[][] newStateArray = currentState.getConnectBoard();


        if(newStateArray[5][3] == 0){
            newStateArray[5][3] = 1;
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
        if(playerSeed == 1){
            bestScore = Integer.MIN_VALUE;
        }else{
            bestScore = Integer.MAX_VALUE;
        }


        State bestState = null;

        for (State generatedState: childrenOfState) {

            if (playerSeed == 1){
                State currentScoreState = minimaxSolve(depth - 1 , 2 , generatedState);
                generatedState.setScore(currentScoreState.getScore());
                currentScore = currentScoreState.getScore();
                if (currentScore > bestScore) {
                    bestScore = currentScore;
                    bestState = generatedState;
                }
            }else {  // oppSeed is minimizing player
                State currentScoreState = minimaxSolve(depth - 1 , 1 , generatedState);
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
