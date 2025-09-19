import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số nguyên a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số nguyên b: ");
            int b = scanner.nextInt();

            int tong = a + b;
            int hieu = a - b;
            int tich = a * b;
            int thuongNguyen = a / b;
            float thuongThuc = (float) a / b;

            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            System.out.println("Thương (kiểu nguyên): " + thuongNguyen);
            System.out.println("Thương (kiểu thực): " + thuongThuc);
        }
    }