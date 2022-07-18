package case_study.controller;

import java.util.Scanner;

public class BookingComtroller {
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

            System.out.println("Mời bạn chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
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
