package demo.ss0_p.utils;

import java.util.Scanner;

public class MenuUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String warrantyCoverage() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Phạm vi bảo hành\n" +
                            "1. Toan quoc\n" +
                            "2. Quoc te");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Toan Quoc";
                case 2:
                    return "Quoc Te";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String status(){
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Trạng Thái\n" +
                            "1. Da sua chua\n" +
                            "2. Chua sua chua");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Da Sua Chua";
                case 2:
                    return "Chua Sua Chua";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }
}
