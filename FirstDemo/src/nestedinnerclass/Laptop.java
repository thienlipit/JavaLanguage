package nestedinnerclass;

public class Laptop {
    double gia;
    public class CPU{
        String nhaSanXuat;
        String loaiChip;
        public int getTheHeCPU(){
            return 12;
        }
    }
    public class RAM{
        String nhaSanXuat;
        String loaiRAM;
        int getBoNhoRAM(){
            return 16;
        }
    }
}
