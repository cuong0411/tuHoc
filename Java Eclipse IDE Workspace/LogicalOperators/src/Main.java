
public class Main {

	public static void main(String[] args) {
		
		int topscore = 80;
		if (topscore == 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 60;
		if (topscore > secondTopScore && topscore < 100) {
			System.out.println("Greater than second top score and less than 100");
		}
		
		boolean isCar = false;
		if (isCar = true) {
			System.out.println("This is assignment operator");
		}
		if (isCar == true) {
			System.out.println("This is equals to operator");
		}
		isCar = false;
		if (!isCar) {
			System.out.println("This is NOT operator");
		}

	}

}
