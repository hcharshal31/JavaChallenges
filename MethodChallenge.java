import java.util.Scanner;

public class MethodChallenge {
    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition();
        displayHighScorePosition("tim", playerPosition);
        displayHighScorePosition("Harshal Chavan", playerPosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the Highschool list");

    }

    public static int calculateHighScorePosition() {
        Scanner myObj = new Scanner(System.in);
        int playerScore;
        System.out.print("Enter player score : ");
        playerScore = myObj.nextInt();

        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
