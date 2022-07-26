package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);
    ICustomerService customerService = new CustomerService();
    public void menuCustomer(){
        do {

            System.out.println("Mời bạn chọn: \n" +
                    "1.Thêm mới khách hàng \n" +
                    "2.Hiển thị danh sách khách hàng \n" +
                    "3.Thay đổi thông tin khách hàng \n" +
                    "4.Quay trở lại menu chính");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose){
                case 1:
                    customerService.add();
                    break;
                case 2:
                    customerService.display();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
