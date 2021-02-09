public class State {

    private int [] []  connectBoard ;
    private int score;


    State(){

    }

    State(int[][] connectBoard){
        this.connectBoard = connectBoard;
        this.score=0;
    }


    public int[][] getConnectBoard() {
        return connectBoard;
    }

    public void setConnectBoard(int[][] connectBoard) {
        this.connectBoard = connectBoard;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}

