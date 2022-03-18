import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a = ");
		a = input.nextInt();
		System.out.print("Nhap b = ");
		b = input.nextInt();
		input.close();
		
		TinhNghiemPTB1.PTB1(a, b);

	}
}
