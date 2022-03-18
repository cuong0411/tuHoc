public class App {
    public static void main(String[] args) {
        
        HocSinh hs1 = new HocSinh(1, "Ana Pham", 9.75);
        hs1.output();
        hs1.rank();

        HocSinh hs2 = new HocSinh(2, "Topson", 7);
        hs2.setHoTen("Jerax");
        hs2.output();
        hs2.rank();

        if(hs1.getDiemTrungBinh() > hs2.getDiemTrungBinh()) {
            System.out.println(hs1.getHoTen() + " co diem trung binh lon hon");
        } else if(hs1.getDiemTrungBinh() == hs2.getDiemTrungBinh()) {
            System.out.println("2 hoc sinh co diem trung binh bang nhau");
        } else {
            System.out.println(hs2.getHoTen() + " co diem trung binh lon hon");
        }
    }
}
