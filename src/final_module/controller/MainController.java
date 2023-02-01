package final_module.controller;

import java.util.Scanner;

public class MainController {
    public static void menuVehicle() {
        OtoController otoController = new OtoController();
        TruckController truckController = new TruckController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nỨNG DỤNG QUẢN LÍ PHƯƠNG TIỆN GIAO THÔNG.\n" +
                    "1.Quản lí Oto.\n" +
                    "2.Quản lí xe tải.\n" +
                    "3.Thoát chương trình.");

            int choose = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    otoController.menuOto();
                    break;
                case 2:
                    truckController.menuTruck();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
