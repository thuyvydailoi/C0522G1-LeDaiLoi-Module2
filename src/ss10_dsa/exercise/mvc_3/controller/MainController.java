package ss10_dsa.exercise.mvc_3.controller;

import java.util.Scanner;

public class MainController {
    public static void meunuController() {
        VehicleAddController addController = new VehicleAddController();
        VehicleRemoveController removeController = new VehicleRemoveController();
        VehicleSearchController vehicleSearchController = new VehicleSearchController();
        VehicleDisplayController vehicleDisplayController = new VehicleDisplayController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG \n" +
                    "Chọn chúc năng: \n" +
                    "1. Thêm mới phương tiện \n" +
                    "2.Hiển thị phương tiện \n" +
                    "3.Xoá phương tiện \n" +
                    "4.Tìm kiếm theo biển kiểm soát \n" +
                    "5.Thoát ");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    addController.menuAddVehicle();
                    break;
                case 2:
                    vehicleDisplayController.menuDisplayVehicle();
                    break;
                case 3:
                    removeController.menuRemoveVehicle();
                    break;
                case 4:
                    vehicleSearchController.menuSearchVehicle();
                    break;
                case 5:
                    System.exit(1);
            }
        } while(true);
    }
}
