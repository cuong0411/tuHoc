import java.util.Scanner;

public class MayIn extends May {
	
	private int sodaukim;
	private int tocdoin;
	
	// set, get
	public int getSodaukim() {
		return sodaukim;
	}
	public void setSodaukim(int sodaukim) {
		this.sodaukim = sodaukim;
	}
	public int getTocdoin() {
		return tocdoin;
	}
	public void setTocdoin(int tocdoin) {
		this.tocdoin = tocdoin;
	}
	
	// constructor
	public MayIn() {
		super();
		this.sodaukim = 1;
		this.tocdoin = 2;
	}
	public MayIn(String tenNSX, String diachi, String hieumay, double giathanh, int sodaukim, int tocdoin) {
		super(tenNSX, diachi, hieumay, giathanh);
		this.sodaukim = sodaukim;
		this.tocdoin = tocdoin;
	}
	
	// nhap, xuat
	public void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dau kim: ");
		this.sodaukim = scanner.nextInt();
		System.out.print("Nhap toc do in: ");
		this.tocdoin = scanner.nextInt();
		scanner.nextLine();
	}
	public String xuat() {
		return super.xuat() + ", " + this.sodaukim + ", " + this.tocdoin;
	}
}
