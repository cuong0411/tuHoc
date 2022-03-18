package operatorsChallenge;

public class Main {

	public static void main(String[] args) {
		double myDouble = 20.00d;
		double mySecondDouble = 80.00d;
		double result = (myDouble + mySecondDouble) * 100.00d;
		int remainder = (int) (result % 40.00);
		System.out.println("The remainder = " + remainder);
		boolean isZero;
		isZero = (remainder == 0) ? true : false;
		System.out.println(isZero);
		if (!isZero) {
			System.out.println("Got some remainder");
		}

	}

}
