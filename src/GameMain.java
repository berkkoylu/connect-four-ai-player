import java.util.Scanner;

public class GameMain {
    //1 2 3
    //human vs ai heuristicNumber minimaxOrAlphabeta
    public static void main(String[] args){

        System.out.println("Choose players");
        System.out.println("1 - Human vs Human");
        System.out.println("2 - Human vs AI");
        System.out.println("3 - AI vs AI");
        Scanner input = new Scanner(System.in);
        int playersConfiguration = input.nextInt();
        if(playersConfiguration == 1){
            ConnectFourHumanvsHuman.playHumanvsHuman();
        }else if(playersConfiguration ==2){
            System.out.println("Choose heuristic");
            System.out.println("1 - Heuristic 1");
            System.out.println("2 - Heuristic 2");
            System.out.println("3 - Heuristic 3");
            int heuristic = input.nextInt();
            System.out.println("Choose algorithm");
            System.out.println("1 - Minimax");
            System.out.println("2 - AlphaBeta");
            int algorithm = input.nextInt();
            System.out.println("Enter depth of the tree");
            int depth = input.nextInt();
            System.out.println("Do you play want to first?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int first = input.nextInt();
            int ai;
            if(first == 1){
                ai = 2;
            }else{
                ai = 1;
            }
            if(algorithm == 1 && ai == 1 && heuristic == 1){
                Minimax1H1 minimax1H1 = new Minimax1H1();
                deneme.humanVsAiminimax1H1(depth,algorithm,ai,minimax1H1);
            }
            if(algorithm == 1 && ai == 2 && heuristic == 1){
                Minimax2H1 minimax2H1 = new Minimax2H1();
                deneme.humanVsAiminimax2H1(depth,algorithm,ai,minimax2H1);
            }
            if(algorithm == 1 && ai == 2 && heuristic == 2){
                Minimax2H2 minimax2H2 = new Minimax2H2();
                deneme.humanVsAiminimax2H2(depth,algorithm,ai,minimax2H2);
            }
            if(algorithm == 1 && ai == 2 && heuristic == 3){
                Minimax2H3 minimax2H3 = new Minimax2H3();
                deneme.humanVsAiminimax2H3(depth,algorithm,ai,minimax2H3);
            }
            if(algorithm == 1 && ai == 1 && heuristic == 2){
                Minimax1H2 minimax1H2 = new Minimax1H2();
                deneme.humanVsAiminimax1H2(depth,algorithm,ai,minimax1H2);
            }
            if(algorithm == 1 && ai == 1 && heuristic == 3){
                Minimax1H3 minimax1H3 = new Minimax1H3();
                deneme.humanVsAiminimax1H3(depth,algorithm,ai,minimax1H3);
            }
            if(algorithm == 2 && ai == 1 && heuristic == 1){
                AlphaBeta1H1 alphaBeta1H1 = new AlphaBeta1H1();
                deneme.humanVsAialphaBeta1H1(depth,algorithm,ai,alphaBeta1H1);
            }
            if(algorithm == 2 && ai == 2 && heuristic == 1){
                AlphaBeta2H1 alphaBeta2H1 = new AlphaBeta2H1();
                deneme.humanVsAialphaBeta2H1(depth,algorithm,ai,alphaBeta2H1);
            }
            if(algorithm == 2 && ai == 1 && heuristic == 2){
                AlphaBeta1H2 alphaBeta1H2 = new AlphaBeta1H2();
                deneme.humanVsAialphaBeta1H2(depth,algorithm,ai,alphaBeta1H2);
            }
            if(algorithm == 2 && ai == 2 && heuristic == 2){
                AlphaBeta2H2 alphaBeta2H2 = new AlphaBeta2H2();
                deneme.humanVsAialphaBeta2H2(depth,algorithm,ai,alphaBeta2H2);
            }
            if(algorithm == 2 && ai == 1 && heuristic == 3){
                AlphaBeta1H3 alphaBeta1H3 = new AlphaBeta1H3();
                deneme.humanVsAialphaBeta1H3(depth,algorithm,ai,alphaBeta1H3);
            }
            if(algorithm == 2 && ai == 2 && heuristic == 3){
                AlphaBeta2H3 alphaBeta2H3 = new AlphaBeta2H3();
                deneme.humanVsAialphaBeta2H3(depth,algorithm,ai,alphaBeta2H3);
            }

        }
        //ai 1 2
        // heuristic 1 2 3
        // algorithm 1 2
        // 2 3 4 4 5
        else if(playersConfiguration == 3){
            System.out.println("Choose heuristic for first Ai");
            System.out.println("1 - Heuristic 1");
            System.out.println("2 - Heuristic 2");
            System.out.println("3 - Heuristic 3");
            int heuristic1 = input.nextInt();
            System.out.println("Choose algorithm for first Ai");
            System.out.println("1 - Minimax");
            System.out.println("2 - AlphaBeta");
            int algorithm1 = input.nextInt();
            System.out.println("Enter depth of the tree of the first Ai");
            int depth1 = input.nextInt();
            int ai1 = 1;
            System.out.println("Choose heuristic for second Ai");
            System.out.println("1 - Heuristic 1");
            System.out.println("2 - Heuristic 2");
            System.out.println("3 - Heuristic 3");
            int heuristic2 = input.nextInt();
            System.out.println("Choose algorithm for second Ai");
            System.out.println("1 - Minimax");
            System.out.println("2 - AlphaBeta");
            int algorithm2 = input.nextInt();
            System.out.println("Enter depth of the tree of the second Ai");
            int depth2 = input.nextInt();
            int ai2 = 2;
            System.out.println("Enter which ai will play first");
            System.out.println("1 - First ai");
            System.out.println("2 - Second ai");
            int firstMove = input.nextInt();
            int test1;
            int test2;
            if(firstMove==1){
                test1=1;
                test2=2;
            }else{
                test1=2;
                test2=1;
            }
            String firstAi = null;
            String secondAi = null;
            if(algorithm1 == 1 && heuristic1 == 1 && firstMove == 1){
                firstAi = "Minimax1H1";
            }
            if(algorithm1 == 1 && heuristic1 == 2 && firstMove == 1){
                firstAi = "Minimax1H2";
            }
            if(algorithm1 == 1 && heuristic1 == 3 && firstMove == 1){
                firstAi = "Minimax1H3";
            }
            if(algorithm1 == 1 && heuristic1 == 1 && firstMove == 2){
                firstAi = "Minimax2H1";
            }
            if(algorithm1 == 1 && heuristic1 == 2 && firstMove == 2){
                firstAi = "Minimax2H2";
            }
            if(algorithm1 == 1 && heuristic1 == 3 && firstMove == 2){
                firstAi = "Minimax2H3";
            }
            if(algorithm1 == 2 && heuristic1 == 1 && firstMove == 1){
                firstAi = "AlphaBeta1H1";
            }
            if(algorithm1 == 2 && heuristic1 == 2 && firstMove == 1){
                firstAi = "AlphaBeta1H2";
            }
            if(algorithm1 == 2 && heuristic1 == 3 && firstMove == 1){
                firstAi = "AlphaBeta1H3";
            }
            if(algorithm1 == 2 && heuristic1 == 1 && firstMove == 2){
                firstAi = "AlphaBeta2H1";
            }
            if(algorithm1 == 2 && heuristic1 == 2 && firstMove == 2){
                firstAi = "AlphaBeta2H2";
            }
            if(algorithm1 == 2 && heuristic1 == 3 && firstMove == 2){
                firstAi = "AlphaBeta2H3";
            }
            ////////////////
            if(algorithm2 == 1 && heuristic2 == 1 && firstMove == 1){
                secondAi = "Minimax2H1";
            }
            if(algorithm2 == 1 && heuristic2 == 2 && firstMove == 1){
                secondAi = "Minimax2H2";
            }
            if(algorithm2 == 1 && heuristic2 == 3 && firstMove == 1){
                secondAi = "Minimax2H3";
            }
            if(algorithm2 == 1 && heuristic2 == 1 && firstMove == 2){
                secondAi = "Minimax1H1";
            }
            if(algorithm2 == 1 && heuristic2 == 2 && firstMove == 2){
                secondAi = "Minimax1H2";
            }
            if(algorithm2 == 1 && heuristic2 == 3 && firstMove == 2){
                secondAi = "Minimax1H3";
            }
            if(algorithm2 == 2 && heuristic2 == 1 && firstMove == 1){
                secondAi = "AlphaBeta2H1";
            }
            if(algorithm2 == 2 && heuristic2 == 2 && firstMove == 1){
                secondAi = "AlphaBeta2H2";
            }
            if(algorithm2 == 2 && heuristic2 == 3 && firstMove == 1){
                secondAi = "AlphaBeta2H3";
            }
            if(algorithm2 == 2 && heuristic2 == 1 && firstMove == 2){
                secondAi = "AlphaBeta1H1";
            }
            if(algorithm2 == 2 && heuristic2 == 2 && firstMove == 2){
                secondAi = "AlphaBeta1H2";
            }
            if(algorithm2 == 2 && heuristic2 == 3 && firstMove == 2){
                secondAi = "AlphaBeta1H3";
            }
            if(firstMove == 1){
                ComputerVsComputer.aivsai(firstAi,secondAi,depth1,depth2,test1,test2);
            }else{
                ComputerVsComputer.aivsai(secondAi,firstAi,depth1,depth2,test2,test1);
            }


        }
    }
    public void humanVsAi(){

    }
}
