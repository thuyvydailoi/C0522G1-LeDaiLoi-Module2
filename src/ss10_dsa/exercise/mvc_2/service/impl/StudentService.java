package ss10_dsa.exercise.mvc_2.service.impl;

import ss10_dsa.exercise.mvc_2.model.Student;
import ss10_dsa.exercise.mvc_2.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
    }

    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xoá: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Bạn có muốn xoá hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    studentList.remove(student);
                    System.out.println("Xoá thành công!. ");
                }
                isFlag= true;
                break;

            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy");
        }
    }

    public static Student infoStudent(){
        return getStudent(scanner);
    }

    static Student getStudent(Scanner scanner) {
        System.out.println("Nhập id: ");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.println("Giới tính: ");
        String gender=(scanner.nextLine());
        return new Student(id, name, point, dateOfBirth, nameClass, gender);
    }
}
