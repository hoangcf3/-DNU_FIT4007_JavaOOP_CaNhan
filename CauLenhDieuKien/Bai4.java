package CauLenhDieuKien;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Số a là số lớn hon: "+ a);
        } else if (b > a){
            System.out.println("Số b là số lớn hon: "+ b);
        }else{
            System.out.println("Hai số bằng nhau ");
        }
    }
}
