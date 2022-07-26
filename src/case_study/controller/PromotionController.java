package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    private final Scanner scanner = new Scanner(System.in);

    public void menuPromotion(){
        do {
            System.out.println("Mời bạn chọn: \n" +
                    "1.Hiển thị danh sách khách hàng sử dụng dịch vụ \n" +
                    "2.Hiển thị danh sách khách hàng có sử dụng ưu đãi \n" +
                    "3.Quay lại menu chính ");

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
                    return;
            }
        }while (true);
    }
}
