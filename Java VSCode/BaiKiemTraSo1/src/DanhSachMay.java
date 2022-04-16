import java.util.Scanner;

public class DanhSachMay {
	
	private May ds[];
	private int n;
	
    public void nhapDS() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so may trong danh sach: ");
            n = scanner.nextInt();
        } while (n <= 0);
        ds = new May[this.n];

        int select;
        for (int i = 0; i < n; i++) {
            System.out.println("1 - May tinh, 2 - May in");
            select = scanner.nextInt();
            if (select == 1) {
                ds[i] = new MayTinh();
                ds[i].nhap();
            } else {
                ds[i] = new MayIn();
                ds[i].nhap();
            }
        }
    }
	public void xuatDS() {
		for (int i = 0; i < n; i++) {
			System.out.println(ds[i].xuat());
		}
	}
	
	// cau 3 Cập nhật địa chỉ của máy thành y theo tên nhà sản xuất x
	// ( với x là tên nhà sản xuất, y là địa chỉ bất kỳ được nhập từ bàn phím)
    public void capNhatDiaChi(String x, String y) {

        for (int i = 0; i < n; i++) {
            if (ds[i].getTenNSX().equals(x)) {
                ds[i].setDiachi(y);

            }

        }
    }
	
	// cau 4 tinh toc do tb cua may tinh trong ds
    public double tinhTocDoTBMayTinh() {
        int count = 0;
        double tong = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i] instanceof MayTinh) {
                count++;
                tong += ((MayTinh) ds[i]).getTocdo();
            }
        }
        if (count == 0) {
            System.out.println("Khong co may tinh trong ds");
            return 0;
        } else {
            return tong / count;
        }
    }
	
	// cau 5 cho biet gia thanh cao nhat
    public double giathanhMAX() {
        double max = ds[0].getGiathanh();
        for (int i = 1; i < n; i++) {
            if (ds[i].getGiathanh() > max) {
                max = ds[i].getGiathanh();
            }

        }
        return max;
    }
		
}
