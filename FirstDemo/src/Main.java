import com.mashape.unirest.http.exceptions.UnirestException;
import dagiac.HinhChuNhat;
import dagiac.HinhVuong;
import dagiac.TamGiac;
import nestedinnerclass.Laptop;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) throws IOException, UnirestException {
        Cat cat = new Cat();
        Dog dog = new Dog();
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


//        System.out.println("--------------Cat------------------");
//        cat.actions();
//        System.out.printf("CAT:" + cat.type);

//        System.out.println("--------------Dog------------------");
//        dog.actions();
//        System.out.printf("CAT:" + dog.type);
            Data data = new Data();
            URL url;
            String s = "https://dummyjson.com/products/1";
            url = new URL(s);
            data.getJson(url);

        }

    }
