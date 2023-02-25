import OOP.Den;
import OOP.IGenericInterface;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Den den = new Den();
        den.batDen(11);

        den.tatDen();

        IGenericInterface<String> reverse = (str) ->{
            String result="";
            for (int i = str.length()-1; i>=0; i--){
                result+= str.charAt(i);
            }
            return result;
        };
        System.out.println("Đảo ngược Lambda = " + reverse.func("Lambda"));

        IGenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for(int i = 1; i<=n; i++){
                result *= i;
            }
            return  result;
        };
        System.out.println("Kết quả 5! = " + factorial.func(5));

//        System.out.println("Hello world!");
//        int a = 15;
//        int b = 10;
//        if (a>b){
//            System.out.printf("%d, %d, \n", a, b);
//        } else System.out.println("b >= a");
//
//        System.out.print("Nhập vào một số nguyên: ");
//        Scanner input = new Scanner(System.in);
//        String soInput = input.nextLine();
//
//        System.out.println("Số bạn vừa nhập là: " + soInput);
//        char[] mangKyTu = {'t', 'u', 'h', 'o', 'c'};
//        for (int i = 0; i < mangKyTu.length; i ++) {
//            System.out.print(mangKyTu[i]);
//        }
//        for (char kyTu : mangKyTu
//             ) {
//            System.out.println(kyTu);
//        }
//        int[] diem = new int[10];
//        int[] diem = {10, 8, 4, 8};
//        diem[0] = 9;
//        diem[3] = 10;
//        for (int value : diem){
//            System.out.print(value + " ");
//        }
//        System.out.println();

//        int[][] a = {
//                {2, 3, 4},
//                {3, 4, 3, 5},
//                {3},
//        };

//        for (int i = 0; i < 3; i ++){
//            for (int j = 0; j < a[i].length; j ++){
//                System.out.print(a[i][j] + " ");
//            }
//        }
//
//        for (int[] mangCon: a){
//            for(int value: mangCon){
//                System.out.print(value);
//            }
//        }

//        int index = 0;
//        int[] diemToan = { 5, 6, 7, 8};
//        int[] diemVan = new int[diemToan.length];
//        for (int toan: diemToan){
//
//            diemVan[index] = toan;
//            ++index;
//        }
//
//        for (int van : diemVan){
//            System.out.println(van);
//        }
//        System.out.println(Arrays.toString(diemVan));

    }
}