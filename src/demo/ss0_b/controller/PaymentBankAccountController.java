package demo.ss0_b.controller;

import demo.ss0_b.service.IPaymentAccountService;
import demo.ss0_b.service.impl.PaymentAccountService;

import java.util.Scanner;

public class PaymentBankAccountController {
    private Scanner scanner = new Scanner(System.in);
    private IPaymentAccountService iPaymentAccountService = new PaymentAccountService();

    public void menuPaymentAccount() {

        do {
            System.out.println("1.Thêm mới tài khoản \n" +
                    "2.Xoá tài khoản \n" +
                    "3.Xem danh sách tài khoản \n" +
                    "4.Tìm kiếm tài khoản \n" +
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
                    iPaymentAccountService.add();
                    break;
                case 2:
                    iPaymentAccountService.remove();
                    break;
                case 3:
                    iPaymentAccountService.display();
                    break;
                case 4:
                    iPaymentAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Vui lòng nhập lại!!!");
            }
        } while (true);
    }
}
