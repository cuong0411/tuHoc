import java.util.Scanner;

public class May {
	
	protected String tenNSX;
	protected String diachi;
	protected String hieumay;
	protected double giathanh;
	
	// get, set
	public String getTenNSX() {
		return tenNSX;
	}
	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getHieumay() {
		return hieumay;
	}
	public void setHieumay(String hieumay) {
		this.hieumay = hieumay;
	}
	public double getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(double giathanh) {
		this.giathanh = giathanh;
	}
	
	// constructor
	public May(String tenNSX, String diachi, String hieumay, double giathanh) {
		this.tenNSX = tenNSX;
		this.diachi = diachi;
		this.hieumay = hieumay;
		this.giathanh = giathanh;
	}
	
	public May() {
		this.tenNSX = "ten nsx";
		this.diachi = "dia chi";
		this.hieumay = "hieu may";
		this.giathanh = 0.0;
	}
	
	// nhap, xuat
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten nha san xuat: ");
		this.tenNSX = scanner.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diachi = scanner.nextLine();
		System.out.print("Nhap hieu may: ");
		this.hieumay = scanner.nextLine();
		System.out.print("Nhap gia thanh: ");
		this.giathanh = scanner.nextDouble();
		scanner.nextLine();
	}
	public String xuat() {
		return this.tenNSX + ", " + this.diachi + ", " + this.hieumay + ", " + this.giathanh;
	}

}
