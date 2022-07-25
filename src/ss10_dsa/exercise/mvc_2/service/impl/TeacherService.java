package ss10_dsa.exercise.mvc_2.service.impl;

import ss10_dsa.exercise.mvc_2.exception.DuplicateIDException;
import ss10_dsa.exercise.mvc_2.model.Teacher;
import ss10_dsa.exercise.mvc_2.service.ITeacherService;
import ss10_dsa.exercise.mvc_2.utils.ReadTeacherFile;
import ss10_dsa.exercise.mvc_2.utils.WriteTeacherFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final String PATH ="src/ss10_dsa/exercise/mvc_2/data/text2.csv";
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void writeFile(){
        WriteTeacherFile.writeTeacherFile(PATH,teacherList);
    }

    public void readFile(){
        List<Teacher>list= ReadTeacherFile.readStudentFile(PATH);
        teacherList.clear();
        teacherList.addAll(list);
    }
    @Override
    public void addTeacher() {
        readFile();
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!. ");
        writeFile();
    }

    @Override
    public void displayAllTeacher() {
        readFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        readFile();
        System.out.println("Mời bạn nhập id cần xoá: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println("Bạn có muốn xoá hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
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
        for (Teacher teacher : teacherList) {
            if (input == teacher.getId()) {
                System.out.println(teacher);
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
        for (Teacher teacher : teacherList) {
            if (input.equals(teacher.getName())) {
                System.out.println(teacher);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sinh viên cần tìm kiếm");
        }
    }

    @Override
    public void sortTeacher() {
        readFile();
        boolean needNextPass;
        needNextPass = true;
        for (int i = 0; i < teacherList.size() && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    needNextPass = true;
                }
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) == 0) {
                    if (teacherList.get(j).getId() > teacherList.get(j + 1).getId()) {
                        Collections.swap(teacherList, j, j + 1);
                    }
                }
            }
        }
        displayAllTeacher();
        writeFile();
    }

    public static Teacher infoTeacher() {
        int id;
        while(true){
            try{
                System.out.println("Nhập id: ");
                 id = Integer.parseInt(scanner.nextLine());

                 for (Teacher teacher : teacherList){
                     if (teacher.getId() == id){
                         throw new DuplicateIDException("Id trùng, vui lòng nhập lại!!!");
                     }
                 }
                 break;
            }catch (NumberFormatException e){
                System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
            } catch (DuplicateIDException e ){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Giới tính: ");
        String gender = (scanner.nextLine());

        System.out.println("Chuyên môn: ");
        String specialize = scanner.nextLine();

        return new Teacher(id, name, dateOfBirth, gender, specialize);
    }
}
