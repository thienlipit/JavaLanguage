package dagiac;

public class HinhChuNhat implements HinhDaGiac {
    int chieuDai, chieuRong;
    public HinhChuNhat(int chieuDai, int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh chu nhat: "+ chieuDai*chieuRong);
    }

    @Override
    public void soCanh() {
        System.out.println("Hinh tu giac co 4 canh");
    }
}
