public class App {
    public static void main(String[] args) {
        
        PhanSo phanSo1 = new PhanSo(4, 8);
        PhanSo phanSo2 = new PhanSo(3, 0);

        phanSo1.xuatPhanSo();
        phanSo2.xuatPhanSo();

        tinhToan tinh = new tinhToan();
        tinh.tinhTong(phanSo1, phanSo2);
        tinh.tinhHieu(phanSo1, phanSo2);    
        tinh.tinhTich(phanSo1, phanSo2);
        tinh.tinhThuong(phanSo1, phanSo2);  
        
    }
}
