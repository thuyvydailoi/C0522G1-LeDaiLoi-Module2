package ss10_dsa.exercise.mvc_2.controller;

import ss10_dsa.exercise.mvc_2.service.IStudentService;
import ss10_dsa.exercise.mvc_2.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();

    public  void menuStudent() {
        do {
            System.out.println("1.Thêm mới học sinh \n" +
                    "2.Xoá học sinh \n" +
                    "3.Xem danh sách học sinh \n" +
                    "4.Tìm kiếm sinh viên id \n" +
                    "5.Tìm kiếm sinh viên theo tên \n" +
                    "6.Sắp xếp danh sách học sinh \n" +
                    "7.Quay về menu chính.");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.searchId();
                    break;
                case 5:
                    iStudentService.searchName();
                    break;
                case 6:
                    iStudentService.sortStudent();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
