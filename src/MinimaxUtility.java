import java.util.ArrayList;
import java.util.List;

interface MinimaxUtility {


    default List<State> generateChildren(State state, int playerSeed){


        List <State> childrenList = new ArrayList<>();
        int [][] connectMatrix = state.getConnectBoard();


            for (int i = 0; i < connectMatrix[0].length; i++) {
                for (int j = connectMatrix.length - 1; j >= 0; j--) {
                    if(connectMatrix[j][i] == 0){
                        connectMatrix[j][i] = playerSeed;
                        int[][] newStateArray = new int[6][7];
                        for (int e = 0; e < connectMatrix.length; e++) {
                            for (int k = 0; k < connectMatrix[0].length; k++) {
                                newStateArray[e][k] = connectMatrix[e][k];
                            }
                        }

                        State newState = new State(newStateArray);
//                        if(newStateArray[0][0] == 0 && newStateArray[0][1] ==2 && newStateArray[0][2] == 0 ) {
//                            newState.setScore(40);
//
//                        }
//
//                        if(newStateArray[0][0] == 0 && newStateArray[0][1] ==0  && newStateArray[0][2] == 2) {
//                            newState.setScore(30);
//
//                        }

                        childrenList.add(newState);
                        connectMatrix[j][i] = 0;


                        break;
                    }

                }
            }



        return childrenList;
    }


    default boolean isGameOver(State state){

        int [][] connectMatrix = state.getConnectBoard();

        for (int i = 0; i < connectMatrix.length; i++) {
            for (int j = 0; j < connectMatrix[0].length; j++) {
                if(connectMatrix[i][j] == 0){
                    return false;
                }
            }
        }

     return true;
    }

}
