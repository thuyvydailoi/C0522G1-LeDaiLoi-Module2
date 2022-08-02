package case_study.service.impl;

import case_study.exception.CustomerException;
import case_study.model.person.Customer;
import case_study.service.ICustomerService;
import case_study.utils.MenuUtil;
import case_study.utils.ReadWriteCustomerUtil;
import case_study.utils.RegexExceptionUtil;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String PATH = "src/case_study/data/customer.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Customer> customerList = ReadWriteCustomerUtil.readCustomerFile(PATH);

        System.out.print("Nhập mã khách hàng: ");
        boolean isExistCode;
        String code;
        do {
            isExistCode = false;
            code = SCANNER.nextLine();
            for (Customer customer : customerList) {
                if (code.equals(customer.getCode())) {
                    System.out.println("Mã khách hàng đã tồn tại, vui lòng nhập lại!");
                    isExistCode = true;
                    break;
                }
            }
        } while (isExistCode);

        System.out.print("Nhập tên khách hàng: ");
        String name = SCANNER.nextLine();

        String dateOfBirth = RegexExceptionUtil.getDateOfBirth();

        String gender = MenuUtil.getGender();

        System.out.print("Nhập số CMND khách hàng: ");
        String id = SCANNER.nextLine();

        System.out.print("Nhập số điện thoại khách hàng: ");
        String phoneNumber = SCANNER.nextLine();

        System.out.print("Nhập email khách hàng: ");
        String email = SCANNER.nextLine();

        String typeOfGuest = MenuUtil.getCustomerType();

        System.out.print("Nhập địa chỉ khách hàng: ");
        String address = SCANNER.nextLine();


        customerList.add(new Customer(code, name, dateOfBirth, gender, id, phoneNumber, email, typeOfGuest, address));
        ReadWriteCustomerUtil.writeCustomerFile(PATH, customerList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadWriteCustomerUtil.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadWriteCustomerUtil.readCustomerFile(PATH);
        boolean isExist = false;
        String editCode;
        while (true) {
            try {
                System.out.println("Nhập mã số khách hàng cần chỉnh sửa: ");
                editCode = SCANNER.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đang nhập sai, vui lòng nhập lại số!!!");
            }
        }
        for (Customer customer : customerList) {
            if ((editCode).equals(customer.getCode())) {
                System.out.println("Vui lòng nhập lại thông tin!");

                System.out.println("Mời thay đổi tên: ");
                customer.setName(SCANNER.nextLine());

                System.out.println("Mời thay đổi ngày sinh: ");
                customer.setDateOfBirth(SCANNER.nextLine());

                System.out.println("Mời thay đổi giới tính: ");
                customer.setGender(SCANNER.nextLine());

                String id;
                while (true) {
                    try {
                        System.out.println("Nhập id: ");
                        id = SCANNER.nextLine();

                        for (Customer customer1 : customerList) {
                            if (customer1.getId().equals(id)) {
                                throw new CustomerException("Id trùng, vui lòng nhập lại!!!");
                            }
                        }
                        break;
                    } catch (CustomerException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Nhập email khách hàng: ");
                    customer.setEmail(SCANNER.nextLine());

                    System.out.println("Nhập loại khách hàng: ");
                    customer.setTypeOfGuest(SCANNER.nextLine());

                    System.out.println("Nhập địa chỉ: ");
                    customer.setAddress(SCANNER.nextLine());

                    System.out.println("Nhập địa chỉ: ");
                    customer.setAddress(SCANNER.nextLine());

                    String phoneNumber;
                    while (true) {
                        try {
                            System.out.println("Nhập số điện thoại: ");
                            phoneNumber = SCANNER.nextLine();

                            for (Customer customer1 : customerList) {
                                if (customer1.getPhoneNumber().equals(phoneNumber)) {
                                    throw new CustomerException("Số điện thoại trùng, vui lòng nhập lại!!!");
                                }
                            }
                            break;
                        } catch (CustomerException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    System.out.println("Đã cập nhật!");
                }
                customer.setId(id);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy nhân viên cần thay đổi");
        }
        ReadWriteCustomerUtil.writeCustomerFile(PATH, customerList);

    }
}
