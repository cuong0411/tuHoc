
public class TinhNghiemPTB1 {
	
	public static void PTB1(int a, int b) {
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			double nghiem = (double) -b/a;
			System.out.println("Phuong trinh co 1 nghiem x = " + nghiem);
		}
	}
}
