package LenhSwitchCase;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự trong NEWS: ");
        char ch = scanner.next().toUpperCase().charAt(0); // Chuyển về chữ hoa

        String direction;

        switch (ch) {
            case 'N': direction = "Bắc"; break;
            case 'S': direction = "Nam"; break;
            case 'W': direction = "Đông"; break;
            case 'E': direction = "Tây"; break;
            default: direction = "Ký tự không hợp lệ"; break;
        }

        System.out.println("Hướng tương ứng là: " + direction);
    }
}