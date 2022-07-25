package case_study.service.impl;

import case_study.exception.EmployeeException;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("Thêm mới thành công!");

    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        boolean isExist = false;
        int editCode;
        while (true) {
            try {
                System.out.println("Nhập mã số nhân viên cần chỉnh sửa: ");
                editCode = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
            }
        }
        for (Employee employee : employeeList) {
            if (employee.getCode() == editCode) {
                System.out.println("Vui lòng nhập lại thông tin!");

                System.out.println("Mời thay đổi tên: ");
                employee.setName(scanner.nextLine());

                System.out.println("Mời thay đổi ngày sinh: ");
                employee.setDateOfBirth(scanner.nextLine());

                System.out.println("Mời thay đổi ngày sinh: ");
                employee.setGender(scanner.nextLine());

                int id;
                while (true) {
                    try {
                        System.out.println("Nhập id: ");
                        id = Integer.parseInt(scanner.nextLine());

                        for (Employee employee1 : employeeList) {
                            if (employee1.getId() == id) {
                                throw new EmployeeException("Id trùng, vui lòng nhập lại!!!");
                            }
                        }
                        break;
                    } catch (EmployeeException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Đã cập nhật!");
                }
                employee.setId(id);
            }
            if (!isExist) {
                System.out.println("Không tìm thấy nhân viên cần thay đổi");
            }
        }
    }


    public static Employee infoEmployee() {
        int code;
        while (true) {
            try {
                System.out.println("Nhập code: ");
                code = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getCode() == code) {
                        throw new EmployeeException("Code trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Giới tính: ");
        String gender = (scanner.nextLine());
        int id;
        while (true) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new EmployeeException("Id trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }

        int phoneNumber;
        while (true) {
            try {
                System.out.println("Nhập số điện thoại: ");
                phoneNumber = Integer.parseInt(scanner.nextLine());

                for (Employee employee : employeeList) {
                    if (employee.getPhoneNumber() == phoneNumber) {
                        throw new EmployeeException("Số điện thoại trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập trình độ: ");
        String level = scanner.nextLine();

        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();

        int wage;
        while (true) {
            try {
                System.out.println("Nhập lương: ");
                wage = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
            }
        }
        return new Employee(code, name, dateOfBirth, gender, id, phoneNumber, email, level, position, wage);

    }
}
