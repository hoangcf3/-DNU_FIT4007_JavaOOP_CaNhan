package LenhSwitchCase;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập phép toán (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (operator) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                    valid = false;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Lỗi: Không thể chia lấy dư với 0.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                valid = false;
        }

        if (valid) {
            System.out.println("Kết quả: " + a + " " + operator + " " + b + " = " + result);
        }
    }
}
