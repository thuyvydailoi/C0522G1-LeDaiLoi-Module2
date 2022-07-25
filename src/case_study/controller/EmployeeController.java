package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private final Scanner scanner = new Scanner(System.in);
    IEmployeeService employee = new EmployeeService();

    public void menuEmployee(){
        do {
            System.out.println("Mời bạn chọn: \n"+
                    "1.Thêm mới nhân viên \n" +
                    "2.Hiển thị danh sách nhân viên \n" +
                    "3.Sửa thông tin nhân viên \n" +
                    "4.Quay trở lại menu chính \n");

            System.out.println("Mời bạn chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    employee.add();
                    break;
                case 2:
                    employee.display();
                    break;
                case 3:
                    employee.edit();
                case 4:
                    return;
            }
        }while (true);
    }
}
