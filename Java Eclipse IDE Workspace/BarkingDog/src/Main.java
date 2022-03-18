
public class Main {

	public static void main(String[] args) {
		
		boolean kq = BarkingDog.shouldWakeUp(false, 7);
		System.out.println(kq);
		
		kq = BarkingDog.shouldWakeUp(true, -1);
		System.out.println(kq);
		
		kq = BarkingDog.shouldWakeUp(true, 24);
		System.out.println(kq);
		
		kq = BarkingDog.shouldWakeUp(true, 7);
		System.out.println(kq);

	}

}
