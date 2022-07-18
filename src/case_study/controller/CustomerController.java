package case_study.controller;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);

    public void menuDisplay(){
        do {

            System.out.println("Mời bạn chọn: \n" +
                    "1.Hiển thị danh sách khách hàng \n" +
                    "2.Thêm mới khách hàng \n" +
                    "3.Thay đổi thông tin khách hàng \n" +
                    "4.Quay trở lại menu chính");

            System.out.println("Mời bạnh chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }while (true);
    }

}
