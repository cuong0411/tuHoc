import java.util.Scanner;

// nguyen tuan cuong
// stt 6

public class TestDS {

    public static void main(String[] args) {

        // cau 1, 2
        DanhSachMay ds = new DanhSachMay();
        ds.nhapDS();
        ds.xuatDS();

        // cau 3, lam sai
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dia chi de cap nhat: ");
        String y = scanner.nextLine();
        System.out.println("Nhap ten nsx: ");
        String x = scanner.nextLine();
        ds.capNhatDiaChi(x, y);
        ds.xuatDS();

        // cau 4
        System.out.println("Toc do trung binh cua may tinh trong ds la: " + ds.tinhTocDoTBMayTinh());

        // cau 5
        System.out.println("Gia thanh cao nhat trong ds la: " + ds.giathanhMAX());
    }

}
