package dagiac;

public interface HinhDaGiac {
    String mauSac = "Xanh";
    void tinhDienTich();
    default void soCanh(){
        System.out.println("So canh da giac:");
    }
}
