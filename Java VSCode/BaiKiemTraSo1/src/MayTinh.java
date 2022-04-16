import java.util.Scanner;

public class MayTinh extends May {
	
	private double tocdo;
	private int dungluongRAM;
	private int dungluongHDD;
	
	// set, get
	public double getTocdo() {
		return tocdo;
	}
	public void setTocdo(double tocdo) {
		this.tocdo = tocdo;
	}
	public int getDungluongRAM() {
		return dungluongRAM;
	}
	public void setDungluongRAM(int dungluongRAM) {
		this.dungluongRAM = dungluongRAM;
	}
	public int getDungluongHDD() {
		return dungluongHDD;
	}
	public void setDungluongHDD(int dungluongHDD) {
		this.dungluongHDD = dungluongHDD;
	}
	
	// constructor
	public MayTinh() {
		super();
		this.tocdo = 100;
		this.dungluongRAM = 8;
		this.dungluongHDD = 256;
	}
	public MayTinh(String tenNSX, String diachi, String hieumay, double giathanh, double tocdo, int dungluongRAM, int dungluongHDD) {
		super(tenNSX, diachi, hieumay, giathanh);
		this.tocdo = tocdo;
		this.dungluongRAM = dungluongRAM;
		this.dungluongHDD = dungluongHDD;
	}
	
	// nhap, xuat
	public void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap toc do: ");
		this.tocdo = scanner.nextDouble();
		System.out.print("Nhap dung luong RAM: ");
		this.dungluongRAM = scanner.nextInt();
		System.out.print("Nhap dung luong HDD: ");
		this.dungluongHDD = scanner.nextInt();
		scanner.nextLine();
	}
	public String xuat() {
		return super.xuat() + ", " + this.tocdo + ", " + this.dungluongRAM + ", " + this.dungluongHDD;
		
	}
	
}
