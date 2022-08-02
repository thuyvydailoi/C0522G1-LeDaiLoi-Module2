package demo.ss0_b.controller;

import java.util.Scanner;

public class BankAccountController {
    public static void menuController(){
        PaymentBankAccountController paymentBankAccountController = new PaymentBankAccountController();
        SavingBankAccountController savingBankAccountController = new SavingBankAccountController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG \n"+
                    "1.Quản lý tài khoản thanh toán \n" +
                    "2.Quản lý tài khoản tiết kiếm \n" +
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
                    paymentBankAccountController.menuPaymentAccount();
                    break;
                case 2:
                    savingBankAccountController.menuSavingBankAccount();
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập lại !!!");
            }
        } while (true);
    }
}
