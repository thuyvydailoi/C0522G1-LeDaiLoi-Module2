package case_study.service.impl;

import case_study.exception.CustomerException;
import case_study.exception.EmployeeException;
import case_study.model.person.Customer;
import case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        Customer customer = infoCustomer();
        customerList.add(customer);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        boolean isExist = false;
        int editId;
        while (true) {
            try {
                System.out.println("Nhập mã số nhân viên cần chỉnh sửa: ");
                editId = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
            }
        }
        for (Customer customer : customerList) {
            if (customer.getCode() == editId) {
                System.out.println("Vui lòng nhập lại thông tin!");
                infoCustomer();
                isExist = true;
                System.out.println("Đã cập nhật!");
                break;
            }
        }

        if(!isExist) {
            System.out.println("Không tìm thấy nhân viên cần thay đổi");
        }

    }

    public static Customer infoCustomer() {
        int code;
        while (true) {
            try {
                System.out.println("Nhập code: ");
                code = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customer.getCode() == code) {
                        throw new CustomerException("Code trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (CustomerException e) {
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

                for (Customer customer : customerList) {
                    if (customer.getId() == id) {
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

                for (Customer customer : customerList) {
                    if (customer.getPhoneNumber() == phoneNumber) {
                        throw new EmployeeException("Số điện thoại trùng, vui lòng nhập lại!!!");
                    }
                }
                break;
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập email khách hàng: ");
        String email = scanner.nextLine();

        System.out.println("Nhập loại khách hàng: ");
        String typeOfGuest = scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        return new Customer(code, name, dateOfBirth, gender, id, phoneNumber, email, typeOfGuest, address);

    }
}
