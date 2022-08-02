package demo.ss0_p.controller;

import demo.ss0_p.service.IGenuinePhoneService;
import demo.ss0_p.service.impl.GenuinePhoneService;

import java.util.Scanner;

public class GenuinePhoneController {
    private Scanner scanner = new Scanner(System.in);
    private IGenuinePhoneService iGenuinePhoneService = new GenuinePhoneService();

    public void menuGenuinePhone() {

        do {
            System.out.println("1.Thêm mới điện thoại chính hãng\n" +
                    "2.Xoá điện thoại chính hãng \n" +
                    "3.Xem danh sách điện thoại chính hãng \n" +
                    "4.Tìm kiếm điện thoại chính hãng \n" +
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
                    iGenuinePhoneService.add();
                    break;
                case 2:
                    iGenuinePhoneService.remove();
                    break;
                case 3:
                    iGenuinePhoneService .display();
                    break;
                case 4:
                    iGenuinePhoneService.find();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
