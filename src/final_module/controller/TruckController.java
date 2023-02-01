package final_module.controller;

import final_module.service.IRegisterService;
import final_module.service.ITruckService;
import final_module.service.impl.RegisterService;
import final_module.service.impl.TruckService;

import java.util.Scanner;

public class TruckController {
    public void menuTruck() {
        Scanner scanner = new Scanner(System.in);
        IRegisterService iRegisterService = new RegisterService();
        ITruckService iTruckService = new TruckService();
        do {
            System.out.println("\nQuản lí xe tải: \n" +
                    "1. Thêm mới xe xe tải. \n" +
                    "2. Hiển thị danh sách xe tải. \n" +
                    "3. Huỷ đăng ký xe tải . \n" +
                    "4.Quay về menu chính. \n");
            int choose = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.getStackTrace();
            }
            switch (choose) {
                case 1:
                    iRegisterService.add();
                    break;
                case 2:
                    iTruckService.display();
                    break;
                case 3:
                    iTruckService.remove();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
