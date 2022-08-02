package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private final Scanner scanner = new Scanner(System.in);
    IEmployeeService employeeService = new EmployeeService();

    public void menuEmployee(){
        do {
            System.out.println("Mời bạn chọn: \n"+
                    "1.Thêm mới nhân viên \n" +
                    "2.Hiển thị danh sách nhân viên \n" +
                    "3.Sửa thông tin nhân viên \n" +
                    "4.Quay trở lại menu chính \n");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose){
                case 1:
                    employeeService.add();
                    break;
                case 2:
                    employeeService.display();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
