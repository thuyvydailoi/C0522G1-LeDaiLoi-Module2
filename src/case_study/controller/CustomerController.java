package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);
    ICustomerService customer = new CustomerService();
    public void menuCustomer(){
        do {

            System.out.println("Mời bạn chọn: \n" +
                    "1.Thêm mới khách hàng \n" +
                    "2.Hiển thị danh sách khách hàng \n" +
                    "3.Thay đổi thông tin khách hàng \n" +
                    "4.Quay trở lại menu chính");

            System.out.println("Mời bạnh chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    customer.add();
                    break;
                case 2:
                    customer.display();
                    break;
                case 3:
                    customer.edit();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
