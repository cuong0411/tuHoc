package methods;

public class Main {

	public static void main(String[] args) {
		
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was " + highScore);
		
		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was " + highScore);
		
		String name1 = "Ana";
		String name2 = "TopSon";
		String name3 = "Jerax";
		String name4 = "Ceb";
		
		int score1 = 1500, score2 = 900, score3 = 400, score4 = 50;
		
		displayHighScorePosition(name1, calculateHighScorePosition(score1));
		displayHighScorePosition(name2, calculateHighScorePosition(score2));
		displayHighScorePosition(name3, calculateHighScorePosition(score3));
		displayHighScorePosition(name4, calculateHighScorePosition(score4));
		
	}
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	public static void displayHighScorePosition(String name, int highScore) {
		System.out.println(name + " managed to get into position " + highScore + " on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore) {
		
		if(playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		}
			return 4;
	}

}
