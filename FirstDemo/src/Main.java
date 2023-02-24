import com.mashape.unirest.http.exceptions.UnirestException;
import tax.StateTax;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
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
