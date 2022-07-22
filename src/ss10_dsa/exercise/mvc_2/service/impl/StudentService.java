package ss10_dsa.exercise.mvc_2.service.impl;

import ss10_dsa.exercise.mvc_2.exception.DuplicateIDException;
import ss10_dsa.exercise.mvc_2.model.Student;
import ss10_dsa.exercise.mvc_2.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        studentList.add(new Student(1, "Le Dai Loi", 1000, "13/1/1997", "C05", "Nam"));
        studentList.add(new Student(2, "Vo Van Ty", -10, "13/1/1997", "C05", "Nam"));
        studentList.add(new Student(3, "Hoang Minh Tri", -100, "13/1/1997", "C05", "Nam"));
        studentList.add(new Student(4, "Huynh Trung Thuyen", 999, "13/1/1997", "C05", "Nam"));
    }

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
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xoá thành công!. ");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchId() {
        System.out.println("Mời bạn nhập id học sinh ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (input == student.getId()) {
                System.out.println(student);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sinh viên cần tìm kiếm");
        }
    }

    @Override
    public void searchName() {
        System.out.println("Mời bạn nhập tên sinh viên cần tìm kiếm: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Student student : studentList) {
            if (input.equals(student.getName())) {
                System.out.println(student);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sinh viên cần tìm kiếm");
        }

    }

    @Override
    public void sortStudent() {
        boolean needNextPass = true;
        for (int i = 0; i < studentList.size() && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    needNextPass = true;
                }
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                    }
                }
            }
        }
        displayAllStudent();
    }

    public static Student infoStudent() {
        return getStudent(scanner);
    }

    static Student getStudent(Scanner scanner) {
        int id;
        while (true){
            try {
                System.out.println("Nhập id: ");
                id=Integer.parseInt(scanner.nextLine());

                for (Student student: studentList){
                    if (student.getId() == id){
                        throw new DuplicateIDException("Id trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
            } catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        int point;
        while (true){
            try {
                System.out.println("Nhập điểm của học sinh: ");
                point = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
            }
        }
        System.out.println("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.println("Giới tính: ");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        String gender = (scanner.nextLine());
        return new Student(id, name, point, dateOfBirth, nameClass, gender);
    }
}
