package dagiac;

public class TamGiac implements HinhDaGiac {
    int a, b, c;
    public TamGiac(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void tinhDienTich() {

    }
    public void tinhChuVi(){
        int chuVi = 0;
//        for (int canh:dodaicanh){
//            chuVi += canh;
//        }
        chuVi = a + b + c;
        System.out.println("Chu vi: "+chuVi);
    }
}
