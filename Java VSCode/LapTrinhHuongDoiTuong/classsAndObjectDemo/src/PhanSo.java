public class PhanSo {
    
    private int tuSo;
    private int mauSo;

    public void xuatPhanSo() {
        System.out.println("Phan so = " + this.tuSo + "/" + this.mauSo);
    }

    public int timUCLN() {
        int ucln = 1;
        int min = (this.tuSo > this.mauSo) ? this.mauSo : this.mauSo;
        for(int i = 1; i <= min; i++) {
            if(this.tuSo % i == 0 && this.mauSo % i == 0) {
                ucln = i;
            }
        }
        return ucln;
    }

    public void rutGonPhanSo() {
        int a = this.timUCLN();
        while(a != 1) {
            this.tuSo = this.tuSo / a;
            this.mauSo = this.mauSo / a;
            a = this.timUCLN();
        }
        System.out.println("Phan so sau khi duoc rut gon = " + this.tuSo + "/" + this.mauSo);
    }
    public void ktMauSo() {
        if(this.mauSo == 0) {
            System.out.println("Mau so khong duoc bang khong");
            this.mauSo = 1;
        }
    }
    public PhanSo() {
        this.mauSo = 1;
    }
    
    public PhanSo(int tuSo) {
        this(tuSo, 1);
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        ktMauSo();
    }
    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    public int getMauSo() {
        return mauSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
        ktMauSo();
    }
}
