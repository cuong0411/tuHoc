import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
//		May m1 = new May();
//		m1.xuat();
//		May m2 = new May("lenovo", "china", "yoga", 100);
//		System.out.println(m1.xuat());
//		
//		System.out.println("Nhap lai m2");
//		m2.nhap();
//		System.out.println(m2.xuat());
		
//		MayTinh mt1 = new MayTinh();
//		System.out.println(mt1.xuat());
//		mt1.nhap();
//		System.out.println(mt1.xuat());
		
//		MayIn mi1 = new MayIn();
//		System.out.println(mi1.xuat());
//		MayIn mi2 = new MayIn("lenovo", "china", "yoga", 100, 1, 1);
//		System.out.println(mi2.xuat());
//		mi2.nhap();
//		System.out.println(mi2.xuat());
		
//		May m1 = new May("lenovo", "viet nam", "yoga", 1);
//		System.out.println(m1.xuat());
//		m1.xuat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x = ");
        String x = scanner.nextLine();
        System.out.println("Nhap y = ");
        String y = scanner.nextLine();
        System.out.println("Ket qua so sanh: " + x.equals(y));
        scanner.close();


	}

}
