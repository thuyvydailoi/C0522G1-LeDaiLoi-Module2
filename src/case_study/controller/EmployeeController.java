package case_study.controller;

import java.util.Scanner;

public class EmployeeController {
    private final Scanner scanner = new Scanner(System.in);

    public void menuAdd(){
        do {
            System.out.println("Mời bạn chọn: \n"+
                    "1.Hiển thị danh sách nhân viên \n" +
                    "2.Thêm nhân viên mới \n" +
                    "3.Sửa thông tin nhân viên \n" +
                    "4.Quay trở lại menu chính \n");

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
