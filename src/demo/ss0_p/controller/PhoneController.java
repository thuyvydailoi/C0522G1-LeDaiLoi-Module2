package demo.ss0_p.controller;

import java.util.Scanner;

public class PhoneController {
    public  static void menuController(){
        GenuinePhoneController genuinePhoneController = new GenuinePhoneController();
        CellPhoneController cellPhoneController = new CellPhoneController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI \n"+
                    "1.Quản lý điện thoại chính hãng \n" +
                    "2.Quản lý điện thoại xách tay \n" +
                    "3.Thoát chương trình");
            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }


            switch (choose) {
                case 1:
                    genuinePhoneController.menuGenuinePhone();
                    break;
                case 2:
                    cellPhoneController.menuCellPhone();
                    break;
                case 3:
                    System.exit(1);
            }
        } while (true);
    }
}
