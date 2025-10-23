package CauLenhDieuKien;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm: ");
        double score = sc.nextDouble();

        if (score >= 0 && score <= 10) {
            System.out.println("Điểm " + score + " là điểm hợp lý.");
        } else {
            System.out.println("Điểm " + score + " không hợp lý.");
        }
    }
}

