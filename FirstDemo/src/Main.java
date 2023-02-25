import OOP.Den;
import OOP.IGenericInterface;
import tax.StateTax;

public class Main {
    public static void main(String[] args) {
        Den den = new Den();
        den.batDen(11);
        den.tatDen();
        IGenericInterface<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Đảo ngược Lambda = " + reverse.func("Lambda"));

        IGenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Kết quả 5! = " + factorial.func(5));

        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.setActionListener(new AnimalAction() {
            @Override
            public void hearMasterCall() {
                System.out.println("gau gau");
            }
        });

        cat.setActionListener(new AnimalAction() {
            @Override
            public void hearMasterCall() {
                System.out.println("meo meo");
            }
        });

//        HinhChuNhat hinhChuNhat = new HinhChuNhat(4,3);
//        HinhVuong hinhVuong = new HinhVuong(4);
//        TamGiac tamGiac = new TamGiac(4, 5, 1);
//
//
//        tamGiac.tinhChuVi();
//
//        hinhChuNhat.soCanh();
//        hinhChuNhat.tinhDienTich();
//        hinhVuong.tinhDienTich();
//
//        Laptop hp = new Laptop();
//        Laptop.CPU cpu = hp.new CPU();
//        System.out.println(cpu.getTheHeCPU());


        System.out.println("--------------Cat------------------");
        System.out.println(cat.eat());
        cat.actions();
        System.out.printf("CAT: ");

        System.out.println("--------------Dog------------------");
        dog.actions();

        System.out.printf("DOG: ");
        callAnimal(dog);
        dog.removeActionListener();

        callAnimal(cat);

        StateTax HP = new StateTax() {
            @Override
            public double stateTax() {
                return 1000;
            }
        };
        calculateTax(HP);


    }
    public static void callAnimal(DongVat dv) {
        dv.callAnimal();
    }

    static void calculateTax(StateTax stateTax){
        double ct = 2000.0;
        double st = stateTax.stateTax();
        double total = ct + st;
        System.out.println("Total tax = "+ total);
    }

}
