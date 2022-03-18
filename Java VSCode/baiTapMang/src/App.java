import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Mang mang1 = new Mang();
        mang1.input();
        mang1.output();

        System.out.println("Tong trung binh le cua mang: " + mang1.tinhTBSoLe());
        System.out.println("Phan tu lon nhat cua mang la: " + mang1.timMax());
        mang1.sapXepTangDan();
        mang1.output();

        Mang mang2 = new Mang();
        mang2.input();
        mang2.output();
        mang2.sapXepTangDan2();
        mang2.output();
    }

}
