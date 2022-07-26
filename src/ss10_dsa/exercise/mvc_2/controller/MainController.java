package ss10_dsa.exercise.mvc_2.controller;

import java.util.Scanner;

public class MainController {
    public  static void menuController(){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chào mừng bạn đến với Codegym \n"+
                    "1.Quản lý học sinh \n" +
                    "2.Quản lý giảng viên \n" +
                    "3.Thoát chương trình");
            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }


            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(1);
            }
        } while (true);
    }
}
