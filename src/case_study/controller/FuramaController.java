package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ KHU NGHỈ DƯỠNG \n" +
                    "Chọn mục: \n" +
                    "1.Quản lý nhân viên \n" +
                    "2.Quản lý khách hàng \n" +
                    "3.Quản lý cơ sở \n" +
                    "4.Quản lý đặt chổ \n" +
                    "5.Quản lý ưu đãi \n" +
                    "6.Thoát");

            System.out.println("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeController.menuEmployee();
                    break;
                case 2:
                    customerController.menuCustomer();
                    break;
                case 3:
                    facilityController.menuFacility();
                    break;
                case 4:
                    bookingController.menuBooking();
                    break;
                case 5:
                    promotionController.menuPromotion();
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
