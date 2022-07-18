package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void menuController() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ KHU NGHỈ DƯỠNG \n" +
                    "Chọn mục: \n" +
                    "1.Quản lý nhân viên \n" +
                    "2.Quản lý khách hàng \n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý đặt chổ \n" +
                    "5.Quản lý ưu đãi \n" +
                    "6.Thoát");

            System.out.println("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(1);
            }
        }while (true);
    }
}
