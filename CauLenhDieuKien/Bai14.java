package CauLenhDieuKien;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        if (a.length() > b.length()) {
            System.out.println("Chuỗi dài hơn là: " + a);
        } else if (b.length() > a.length()) {
            System.out.println("Chuỗi dài hơn là: " + b);
        } else {
            System.out.println("Hai chuỗi có độ dài bằng nhau. In ra chuỗi a: " + a);
        }
    }
}
