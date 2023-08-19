public class NewChallenge {
    public static void main(String[] args){

        calculateScore(false, 8000, 7, 500 );
//        boolean gameOverIs = true;
//        int scoreIs = 800;
//        int levelCompletedIs = 5;
//        int bonusIs = 100;
//
//        int finalScoreIs = scoreIs;
//        if (gameOverIs == true) {
//            finalScoreIs += (levelCompletedIs * bonusIs);
//            System.out.println("The final score is " + finalScoreIs);
//         }
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("The final score is " + finalScore);
        } else {
            System.out.println("condition is not true. ");
        }
    }
}
