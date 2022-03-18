public class HCN {
    
    private int cd;
    private int cr;
    
    public HCN(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }
    public int getCd() {
        return cd;
    }
    public void setCd(int cd) {
        this.cd = cd;
    }
    public int getCr() {
        return cr;
    }
    public void setCr(int cr) {
        this.cr = cr;
    }
    public void thongBao(int cd, int cr) {
        System.out.println("Dien tich hcn: " + cd*cr);
    }
    public void thongBao(int canh) {
        System.out.println("Dien tich hinh vuong: " + canh*canh);
    }

    
}
