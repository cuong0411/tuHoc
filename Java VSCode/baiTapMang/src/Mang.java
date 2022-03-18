import java.util.Scanner;

public class Mang {
    private static Scanner scanner = new Scanner(System.in);
    int soPhanTu;
    int[] mang;

    public int getSoPhanTu() {
        return soPhanTu;
    }

    public void setSoPhanTu(int soPhanTu) {
        if (soPhanTu < 0) {
            this.soPhanTu = 0;
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
        do {
            System.out.print("Nhap so phan tu: ");
            this.soPhanTu = scanner.nextInt();
            scanner.nextLine();
        } while (this.soPhanTu <= 0);
        this.mang = new int[this.soPhanTu];
        for (int i = 0; i < this.soPhanTu; i++) {
            System.out.print("Nhap phan tu #" + i + "= ");
            this.mang[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public void output() {
        for (int phanTu : this.mang) {
            System.out.print(phanTu + " ");
        }
        System.out.println();
    }

    private static boolean ktSoLe(int so) {
        if (so % 2 != 0) {
            return true;
        }
        return false;
    }

    public double tinhTBSoLe() {
        int tong = 0;
        int count = 0;
        for (int i = 0; i < this.mang.length; i++) {
            if (ktSoLe(this.mang[i]) == true) {
                tong += this.mang[i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) tong / count;
    }

    public int timMax() {
        if (this.mang.length == 1) {
            return this.mang[0];
        }
        int max = this.mang[0];
        for (int i = 1; i < this.mang.length; i++) {
            if (max < this.mang[i]) {
                max = this.mang[i];
            }
        }
        return max;
    }

    public void sapXepTangDan() {
        while (true) {
            boolean isStop = true;
            for (int i = 0; i < this.mang.length - 1; i++) {
                if (this.mang[i] > this.mang[i + 1]) {
                    isStop = false;
                    int temp = this.mang[i];
                    this.mang[i] = this.mang[i + 1];
                    this.mang[i + 1] = temp;
                }
            }
            if (isStop) {
                break;
            }
        }
    }

    public void sapXepTangDan2() {
        for (int i = 0; i < this.mang.length - 1; i++) {
            for (int j = 0; j < this.mang.length - i - 1; j++) {
                if (this.mang[j] > this.mang[j + 1]) {
                    int temp = this.mang[j];
                    this.mang[j] = this.mang[j + 1];
                    this.mang[j + 1] = temp;
                }
            }
        }
    }
}
