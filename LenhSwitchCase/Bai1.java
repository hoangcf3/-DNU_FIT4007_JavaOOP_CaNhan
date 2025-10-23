package LenhSwitchCase;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên từ 0 đến 9: ");
        int n = scanner.nextInt();
        String read;
        switch (n) {
            case 0: read = "Không"; break;
            case 1: read = "Một"; break;
            case 2: read = "Hai"; break;
            case 3: read = "Ba"; break;
            case 4: read = "Bốn"; break;
            case 5: read = "Năm"; break;
            case 6: read = "Sáu"; break;
            case 7: read = "Bảy"; break;
            case 8: read = "Tám"; break;
            case 9: read = "Chín"; break;
            default: read = "Số không hợp lệ"; break;
        }

        System.out.println("Cách đọc: " + read);
    }
}