public class tinhToan {

    private int tuSo = 1;
    private int mauSo = 1;

    public void traVePhanSo() {
        PhanSo ps = new PhanSo(this.tuSo, this.mauSo);
        ps.rutGonPhanSo();
    }

    public void tinhTong(PhanSo phanSo1, PhanSo phanSo2) {

        this.tuSo = phanSo1.getTuSo() * phanSo2.getMauSo() + phanSo1.getMauSo() * phanSo2.getTuSo();
        this.mauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
        System.out.println("Tong = " + tuSo + "/" + mauSo);
        traVePhanSo();
    }

    public void tinhHieu(PhanSo phanSo1, PhanSo phanSo2) {

        this.tuSo = phanSo1.getTuSo() * phanSo2.getMauSo() - phanSo1.getMauSo() * phanSo2.getTuSo();
        this.mauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
        System.out.println("Hieu = " + tuSo + "/" + mauSo);
        traVePhanSo();
    }

    public void tinhTich(PhanSo phanSo1, PhanSo phanSo2) {

        this.tuSo = phanSo1.getTuSo() * phanSo2.getTuSo();
        this.mauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
        System.out.println("Tich = " + tuSo + "/" + mauSo);
        traVePhanSo();
    }

    public void tinhThuong(PhanSo phanSo1, PhanSo phanSo2) {

        this.tuSo = phanSo1.getTuSo() * phanSo2.getMauSo();
        this.mauSo = phanSo1.getMauSo() * phanSo2.getTuSo();
        System.out.println("Thuong = " + tuSo + "/" + mauSo);
        traVePhanSo();
    }
}
