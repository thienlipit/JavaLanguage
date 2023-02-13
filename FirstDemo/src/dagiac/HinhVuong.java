package dagiac;

public class HinhVuong implements HinhDaGiac {
    int chieuDaiCanh;
    public HinhVuong(int chieuDaiCanh){
        this.chieuDaiCanh = chieuDaiCanh;
    }
    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh vuong: "+ chieuDaiCanh*chieuDaiCanh);
    }
}
