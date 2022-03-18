import java.util.Scanner;

class HinhChuNhat {
    int dai, rong;

    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }
    public int getDai() {
        return dai;
    }
    public int getRong() {
        return rong;
    }

    public int tinhDienTich() {
        return dai * rong;
    }
    public int tinhChuVi() {
        return (dai + rong) * 2;
    }

}

public class tinhDienTichHCN {
    public static void main(String[] args) {

        int dai, rong;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        dai = sc.nextInt();

        System.out.print("Nhap chieu rong: ");
        rong = sc.nextInt();

        sc.close();
        
        HinhChuNhat hcn = new HinhChuNhat(dai, rong);

        System.out.println("HCN co chieu dai = " + hcn.getDai()
            + " va chieu rong = " + hcn.getRong());
        System.out.println("Dien tich HCN = " + hcn.tinhDienTich());
        System.out.println("Chu vi HCM = " + hcn.tinhChuVi());
    }
}
