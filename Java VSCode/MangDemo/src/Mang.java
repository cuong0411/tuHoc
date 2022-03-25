import java.util.Scanner;

public class Mang {
    private int soPhanTu;
    private int[] mang;
    private static Scanner scanner = new Scanner(System.in);

    //constructor
    public Mang() {
        //
    }
    public Mang(int soPhanTu, int[] mang) {
        this.soPhanTu = soPhanTu;
        this.mang = mang;
    }

    //get(), set()
    public int getSoPhanTu() {
        return soPhanTu;
    }
    public void setSoPhanTu(int soPhanTu) {
        if (soPhanTu < 0) {
            soPhanTu = 0;
        }
        this.soPhanTu = soPhanTu;
    }
    public int[] getMang() {
        return mang;
    }
    public void setMang(int[] mang) {
        this.mang = mang;
    }

    public void input() {
        do{
            System.out.print("Nhap so phan tu: ");
            this.soPhanTu = scanner.nextInt();
            scanner.nextLine();
        } while (this.soPhanTu <= 0);
        this.mang = new int[soPhanTu];
        for (int i=0; i<this.soPhanTu; i++) {
            System.out.print("Phan tu #" + i + "= ");
            this.mang[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }
    public void output() {
        for (int i=0; i<this.soPhanTu; i++) {
            System.out.print(this.mang[i] + " ");
        }
        System.out.println();
    }

}
