package ss10_dsa.exercise.mvc_2.service.impl;

import ss10_dsa.exercise.mvc_2.exception.DuplicateIDException;
import ss10_dsa.exercise.mvc_2.model.Student;
import ss10_dsa.exercise.mvc_2.service.IStudentService;
import ss10_dsa.exercise.mvc_2.utils.ReadStudentFile;
import ss10_dsa.exercise.mvc_2.utils.WriteStudentFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final String PATH = "src/ss10_dsa/exercise/mvc_2/data/student.csv";
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void writeFile() {
        WriteStudentFile.writeStudentFile(PATH, studentList);
    }

    public void readFile() {
        List<Student> list = ReadStudentFile.readStudentFile(PATH);
        studentList.clear();
        studentList.addAll(list);
    }

    @Override
    public void addStudent() {
        readFile();
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
        writeFile();
    }

    @Override
    public void displayAllStudent() {
        readFile();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        readFile();
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
        writeFile();

        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchId() {
        readFile();
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
        readFile();
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
        readFile();
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
        writeFile();
    }

    public static Student infoStudent() {
        int id;
        while (true) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Student student : studentList) {
                    if (student.getId() == id) {
                        throw new DuplicateIDException("Id trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        int point;
        while (true) {
            try {
                System.out.println("Nhập điểm của học sinh: ");
                point = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
            }
        }

        String dateOfBirth;
        String regex = "^(((0[1-9]|[12][0-9]|30)[-/]?(0[13-9]|1[012])|31[-/]?(0[13578]|1[02])" +
                "|(0[1-9]|1[0-9]|2[0-8])[-/]?02)[-/]?[0-9]{4}|29[-/]?02[-/]?([0-9]{2}" +
                "(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
        do {
            System.out.println("Nhập ngày sinh: ");
            dateOfBirth = scanner.nextLine();
            if (dateOfBirth.matches(regex)) {
                break;
            } else {
                System.out.println("Bạn đang nhập sai, vui lòng nhập theo đúng định dạng dd/mm/yyyy");
            }
        } while (true);


        System.out.println("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();

        System.out.println("Giới tính: ");
        String gender = (scanner.nextLine());
        return new Student(id, name, point, dateOfBirth, nameClass, gender);
    }
}
