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

            System.out.println("Mời bạn chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                case 2:
                case 3:
                    return;
            }
        }while (true);
    }
}
