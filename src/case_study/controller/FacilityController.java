package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    private final Scanner scanner = new Scanner(System.in);

    public  void menuFacility(){
        do {
            System.out.println("Mời bạn chọn: \n" +
                    "1.Hiển thị cơ sở \n" +
                    "2.Thêm cơ sở mới \n" +
                    "3.Hiển thị danh sách cơ sở cần bảo trì \n" +
                    "4.Quay lại menu chính");

            System.out.println("Mời bạn chọn: ");
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
