package case_study.service.impl;

import case_study.exception.CustomerException;
import case_study.exception.EmployeeException;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.MenuUtil;
import case_study.utils.ReadWriteCustomerUtil;
import case_study.utils.ReadWriteEmployeeUtil;
import case_study.utils.RegexExceptionUtil;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final String PATH = "src/case_study/data/employee.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);

        System.out.print("Nhập mã số nhân viên: ");
        boolean isExistCode;
        String code;
        do {
            isExistCode = false;
            code = SCANNER.nextLine();
            for (Employee employee : employeeList) {
                if (code.equals(employee.getCode())) {
                    System.out.println("Mã nhân viên đã tồn tại, vui lòng nhập lại!");
                    isExistCode = true;
                    break;
                }
            }
        } while (isExistCode);

        System.out.print("Nhập tên nhân viên: ");
        String name = SCANNER.nextLine();

        String dateOfBirth = RegexExceptionUtil.getDateOfBirth();

        String gender = MenuUtil.getGender();

        System.out.print("Nhập số CMND nhân viên: ");
        String id = SCANNER.nextLine();

        System.out.print("Nhập số điện thoại nhân viên: ");
        String phone = SCANNER.nextLine();

        System.out.print("Nhập email nhân viên: ");
        String email = SCANNER.nextLine();

        String level = MenuUtil.getLevel();

        String position = MenuUtil.getPosition();

        System.out.print("Nhập lương nhân viên (VNĐ/tháng): ");
        int salary;
        do {
            try {
                salary = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        } while (true);

        employeeList.add(new Employee(code, name, dateOfBirth, gender, id, phone, email, level, position, salary));
        ReadWriteEmployeeUtil.writeEmployeeFile(PATH, employeeList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
        boolean isExist = false;
        String editCode;
        while (true) {
            try {
                System.out.println("Nhập mã số nhân viên cần chỉnh sửa: ");
                editCode = SCANNER.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại !!!");
            }
        }
        for (Employee employee : employeeList) {
            if ((editCode).equals(employee.getCode())) {
                System.out.println("Vui lòng nhập lại thông tin!");

                System.out.println("Mời thay đổi tên: ");
                employee.setName(SCANNER.nextLine());

                System.out.println("Mời thay đổi ngày sinh: ");
                employee.setDateOfBirth(SCANNER.nextLine());

                System.out.println("Mời thay đổi giới tính: ");
                employee.setGender(SCANNER.nextLine());
                String phoneNumber;
                while (true) {
                    try {
                        System.out.println("Nhập số điện thoại: ");
                        phoneNumber = SCANNER.nextLine();

                        for (Employee employee1 : employeeList) {
                            if (employee1.getPhoneNumber().equals(phoneNumber)) {
                                throw new EmployeeException("Số điện thoại trùng, vui lòng nhập lại!!!");
                            }
                        }
                        break;
                    } catch (EmployeeException e) {
                        System.out.println(e.getMessage());
                    }
                }

                System.out.println("Nhập email nhân viên: ");
                employee.setEmail(SCANNER.nextLine());

                employee.setPosition(MenuUtil.getPosition());

                System.out.println("Nhập lại lương: ");
                employee.setWage(Double.parseDouble(SCANNER.nextLine()));

                String id;
                while (true) {
                    try {
                        System.out.println("Nhập id: ");
                        id = SCANNER.nextLine();

                        for (Employee employee1 : employeeList) {
                            if (employee1.getId().equals(id)) {
                                throw new CustomerException("Id trùng, vui lòng nhập lại!!!");
                            }
                        }
                        break;
                    } catch (CustomerException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Đã cập nhật!");

                employee.setId(id);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy nhân viên cần thay đổi");
        }
        ReadWriteEmployeeUtil.writeEmployeeFile(PATH, employeeList);
        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }
//    @Override
//    public void add() {
//        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
//        Employee employee = infoEmployee();
//        employeeList.add(employee);
//        ReadWriteEmployeeUtil.writeEmployeeFile(PATH, employeeList);
//        System.out.println("Thêm mới thành công!");
//
//    }
//
//    @Override
//    public void display() {
//        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
//        for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }
//    }
//
//    @Override
//    public void edit() {
//        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
//        boolean isExist = false;
//        String editCode;
//        while (true) {
//            try {
//                System.out.println("Nhập mã số nhân viên cần chỉnh sửa: ");
//                editCode = SCANNER.nextLine();
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
//            }
//        }
//        for (Employee employee : employeeList) {
//            if (employee.getCode().equals(editCode)) {
//                System.out.println("Vui lòng nhập lại thông tin!");
//
//                System.out.println("Mời thay đổi tên: ");
//                employee.setName(SCANNER.nextLine());
//
//                System.out.println("Mời thay đổi ngày sinh: ");
//                employee.setDateOfBirth(SCANNER.nextLine());
//
//                System.out.println("Mời thay đổi giới tính: ");
//                employee.setGender(SCANNER.nextLine());
//
//                int id;
//                while (true) {
//                    try {
//                        System.out.println("Nhập id: ");
//                        id = Integer.parseInt(SCANNER.nextLine());
//
//                        for (Employee employee1 : employeeList) {
//                            if (employee1.getId() == id) {
//                                throw new EmployeeException("Id trùng, vui lòng nhập lại!!!");
//                            }
//                        }
//                        break;
//                    } catch (EmployeeException e) {
//                        System.out.println(e.getMessage());
//                    }
//
//                    String phoneNumber;
//                    while (true) {
//                        try {
//                            System.out.println("Mời thay đổi số điện thoại: ");
//                            phoneNumber = SCANNER.nextLine();
//
//                            for (Employee employee1 : employeeList) {
//                                if (employee1.getPhoneNumber().equals(phoneNumber)) {
//                                    throw new EmployeeException("Số điện thoại trùng, vui lòng nhập lại!!!");
//                                }
//                            }
//                            break;
//                        } catch (EmployeeException e) {
//                            System.out.println(e.getMessage());
//                        }
//                    }
//
//                    System.out.println("Mời thay đổi  email: ");
//                    employee.setEmail(SCANNER.nextLine());
//
//                    System.out.println("Mời thay đổi trình độ: ");
//                    employee.setLevel(SCANNER.nextLine());
//
//                    System.out.println("Mời thay đổi vị trí: ");
//                    employee.setPosition(SCANNER.nextLine());
//
//                    int wage;
//                    while (true) {
//                        try {
//                            System.out.println("Mời thay đổi lương: ");
//                            wage = Integer.parseInt(SCANNER.nextLine());
//                            break;
//                        } catch (NumberFormatException e) {
//                            System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
//                        }
//                    }
//                    employee.setWage(wage);
//                    System.out.println("Đã cập nhật!");
//                }
//                employee.setId(id);
//                ReadWriteEmployeeUtil.writeEmployeeFile(PATH, employeeList);
//                isExist = true;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Không tìm thấy nhân viên cần thay đổi");
//        }
//    }
//
//    public static Employee infoEmployee() {
//        List<Employee> employeeList = ReadWriteEmployeeUtil.readEmployeeFile(PATH);
//        String code;
//        while (true) {
//            try {
//                System.out.println("Nhập code: ");
//                code = SCANNER.nextLine();
//                for (Employee employee : employeeList) {
//                    if (employee.getCode().equals(code)) {
//                        throw new EmployeeException("Code trùng, vui lòng nhập lại!!!");
//                    }
//                }
//                break;
//            } catch (EmployeeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//
//        System.out.println("Nhập tên: ");
//        String name = SCANNER.nextLine();
//
//        System.out.println("Nhập ngày sinh: ");
//        String dateOfBirth = SCANNER.nextLine();
//
//        System.out.println("Giới tính: ");
//        String gender = (SCANNER.nextLine());
//
//        int id;
//        while (true) {
//            try {
//                System.out.println("Nhập id: ");
//                id = Integer.parseInt(SCANNER.nextLine());
//
//                for (Employee employee : employeeList) {
//                    if (employee.getId() == id) {
//                        throw new EmployeeException("Id trùng, vui lòng nhập lại!!!");
//                    }
//                }
//                break;
//            } catch (EmployeeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        String phoneNumber;
//        while (true) {
//            try {
//                System.out.println("Nhập số điện thoại: ");
//                phoneNumber = SCANNER.nextLine();
//
//                for (Employee employee : employeeList) {
//                    if (employee.getPhoneNumber().equals(phoneNumber)) {
//                        throw new EmployeeException("Số điện thoại trùng, vui lòng nhập lại!!!");
//                    }
//                }
//                break;
//            } catch (EmployeeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.println("Nhập email: ");
//        String email = SCANNER.nextLine();
//
//        System.out.println("Nhập trình độ: ");
//        String level = SCANNER.nextLine();
//
//        System.out.println("Nhập vị trí: ");
//        String position = SCANNER.nextLine();
//
//        int wage;
//        while (true) {
//            try {
//                System.out.println("Nhập lương: ");
//                wage = Integer.parseInt(SCANNER.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đang nhập sai, vui lòng nhập số!!!");
//            }
//        }
//
//        return new Employee(code, name, dateOfBirth, gender, id, phoneNumber, email, level, position, wage);
//    }
}
