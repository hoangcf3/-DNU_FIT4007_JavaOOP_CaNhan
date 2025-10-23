package CauLenhDieuKien;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi thứ nhất: ");
        String a = scanner.nextLine();

        System.out.print("Nhập chuỗi thứ hai: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }
    }
}
