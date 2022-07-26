package case_study.controller;

import java.util.Scanner;

public class BookingController {
    private  final Scanner scanner = new Scanner(System.in);

    public void menuBooking(){
        do {
            System.out.println("Mời bạn chọn: \n" +
                    "1.Thêm mới đặt phòng \n" +
                    "2.Hiển thị danh sách phòng \n" +
                    "3.Tạo mới hợp đồng \n" +
                    "4.Hiển thị danh sách hợp đồng \n" +
                    "5.Thay đổi thông tin hợp đồng \n" +
                    "6.Quay lại menu chính");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return;
            }
        }while (true);
    }
}
