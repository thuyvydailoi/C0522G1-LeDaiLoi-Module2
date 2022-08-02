package demo.ss0_b.controller;

import demo.ss0_b.service.ISavingBankAccountService;
import demo.ss0_b.service.impl.SavingBankAccountService;

import java.util.Scanner;

public class SavingBankAccountController {


    public void menuSavingBankAccount() {
        Scanner scanner = new Scanner(System.in);
        ISavingBankAccountService iSavingBankAccountService = new SavingBankAccountService();
        do {
            System.out.println("1.Thêm mới tài khoản tiết kiệm \n" +
                    "2.Xoá tài khoản tài khoản tiết kiệm \n" +
                    "3.Xem danh sách tài khoản tiết kiệm \n" +
                    "4.Tìm kiếm tài khoản tiết kiệm th \n" +
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
                    iSavingBankAccountService.add();
                    break;
                case 2:
                    iSavingBankAccountService.remove();
                    break;
                case 3:
                    iSavingBankAccountService.display();
                    break;
                case 4:
                    iSavingBankAccountService.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Vui lòng nhập lại!!!");
            }
        } while (true);
    }
}
