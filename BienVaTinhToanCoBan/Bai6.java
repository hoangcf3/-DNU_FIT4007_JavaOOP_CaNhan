package BienVaTinhToanCoBan;

import java.util.Scanner;
    public class Bai6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số nguyên N: ");
            int n = sc.nextInt();

            // Lấy trị tuyệt đối phòng khi n < 0
            int chuSoCuoi = Math.abs(n % 10);

            System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);

            sc.close();
        }
    }

