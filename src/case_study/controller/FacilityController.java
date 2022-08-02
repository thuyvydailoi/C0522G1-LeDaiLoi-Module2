package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FalicityService;

import java.util.Scanner;

public class FacilityController {
    public void menuFacility() {
            Scanner scanner = new Scanner(System.in);
            IFacilityService iFacilityService = new FalicityService();
            do {
                System.out.println("\nQUẢN LÝ CƠ SỞ:\n" +
                        "1. Hiển thị cơ sở.\n" +
                        "2. Thêm mới cơ sở.\n" +
                        "3. Hiển thị danh sách bảo trì cơ sở.\n" +
                        "4. Trở về MENU chính.");
                int choose = 0;
                try {
                    System.out.print("Mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.getStackTrace();
                }

                switch (choose) {
                    case 1:
                        iFacilityService.display();
                        break;
                    case 2:
                        iFacilityService.add();
                        break;
                    case 3:
                        iFacilityService.displayMaintenance();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                }
            } while (true);
        }
}
