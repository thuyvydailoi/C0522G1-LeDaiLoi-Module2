package final_module.controller;

import final_module.service.IOtoService;
import final_module.service.IRegisterService;
import final_module.service.impl.OtoService;
import final_module.service.impl.RegisterService;

import java.util.Scanner;

public class OtoController {
    public void menuOto() {
        Scanner scanner = new Scanner(System.in);
        IOtoService iOtoService = new OtoService();
        IRegisterService iRegisterService = new RegisterService();
        do {
            System.out.println("\nQuản lí Oto: \n" +
                    "1. Thêm mới xe Oto. \n" +
                    "2. Hiển thị danh sách Oto. \n" +
                    "3. Huỷ đăng ký Oto . \n" +
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
                    iOtoService.display();
                    break;
                case 3:
                    iOtoService.remove();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        } while (true);
    }
}
