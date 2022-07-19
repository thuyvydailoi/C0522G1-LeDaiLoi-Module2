package ss10_dsa.exercise.mvc_2.controller;

import ss10_dsa.exercise.mvc_2.service.ITeacherService;
import ss10_dsa.exercise.mvc_2.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("1. Thêm mới giảng viên \n" +
                    "2.Xoá giảng viên \n" +
                    "3.Xem danh sách giảng viên \n" +
                    "4.Tìm kiếm giảng viên theo id \n" +
                    "5.Tìm kiếm giảng viên theo tên \n" +
                    "4. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    iTeacherService.searchId();
                    break;
                case 5:
                    iTeacherService.searchName();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
