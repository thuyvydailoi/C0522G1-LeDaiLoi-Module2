package demo.ss0_p.controller;

import demo.ss0_p.service.ICellPhoneService;
import demo.ss0_p.service.impl.CellPhoneService;

import java.util.Scanner;

public class CellPhoneController {
    private Scanner scanner = new Scanner(System.in);
    private ICellPhoneService iCellPhoneService = new CellPhoneService();

    public void menuCellPhone() {

        do {
            System.out.println("1.Thêm mới điện thoại xách tay \n" +
                    "2.Xoá điện thoại xách tay \n" +
                    "3.Xem danh sách điện thoại xách tay \n" +
                    "4.Tìm kiếm điện thoại xách tay \n" +
                    "5.Quay về menu chính.");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    iCellPhoneService.add();
                    break;
                case 2:
                    iCellPhoneService.remove();
                    break;
                case 3:
                    iCellPhoneService .display();
                    break;
                case 4:
                    iCellPhoneService.find();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
