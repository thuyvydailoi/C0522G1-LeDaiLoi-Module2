package demo.ss0_p.service.impl;

import demo.ss0_p.exception.AmountException;
import demo.ss0_p.exception.CountryInvalidException;
import demo.ss0_p.exception.NotFoundPhoneException;
import demo.ss0_p.exception.PriceException;
import demo.ss0_p.model.CellPhone;
import demo.ss0_p.model.Phone;
import demo.ss0_p.service.ICellPhoneService;
import demo.ss0_p.utils.MenuUtil;
import demo.ss0_p.utils.ReadWritePhoneFileUtil;

import java.util.List;
import java.util.Scanner;

public class CellPhoneService implements ICellPhoneService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/case_study_phone/data/cellphone.csv";

    @Override
    public void add() {
        List<Phone> phoneList = ReadWritePhoneFileUtil.readPhoneFile(PATH);

        int id;
        if (phoneList.size() == 0) {
            id = 1;
        } else {
            id = phoneList.get(phoneList.size() - 1).getId() + 1;
        }

        System.out.println("Mời nhập tên điện thoại: ");
        String phoneName = SCANNER.nextLine();

        int price;
        while (true) {
            try {
                System.out.println("nhập số tiền");
                price = Integer.parseInt(SCANNER.nextLine());
                if (price <= 0) {
                    throw new PriceException("Số tiền phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (PriceException e) {
                System.out.println(e.getMessage());
            }
        }

        int amount;
        while (true) {
            try {
                System.out.println("vui lòng nhập số lượng");
                amount = Integer.parseInt(SCANNER.nextLine());
                if (amount <= 0) {
                    throw new AmountException("Số lượng phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            } catch (AmountException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhà sản xuất");
        String producer = SCANNER.nextLine();

        String nation;
        do {
            try {
                System.out.println("vui lòng nhập quốc gia");
                nation = SCANNER.nextLine();
                if (!nation.matches("^[A-Z][a-z]+( [A-Z][a-z]+)*")) {
                    throw new CountryInvalidException("Vui lòng viết hoa chữ cái đầu!");
                }
                if (nation.matches("^Viet Nam$")) {
                    throw new CountryInvalidException("Không cho phép nhập Việt Nam!");
                }
                break;
            } catch (CountryInvalidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String status = MenuUtil.status();

        phoneList.add(new CellPhone(id, phoneName, price, amount, producer, nation, status));
        ReadWritePhoneFileUtil.writePhoneFile(PATH, phoneList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        List<Phone> phoneList = ReadWritePhoneFileUtil.readPhoneFile(PATH);
        boolean isExist = false;
        int idRemove;

        do {
            System.out.println("Mời bạn nhập id cần xóa: ");
            idRemove = Integer.parseInt(SCANNER.nextLine());
            for (Phone phone : phoneList) {
                if (phone.getId() == idRemove) {
                    System.out.println("Điện thoại cần xóa: ");
                    System.out.println(phone);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String select = SCANNER.nextLine();
                    if (select.equals("1")) {
                        phoneList.remove(phone);
                        ReadWritePhoneFileUtil.writePhoneFile(PATH, phoneList);
                        System.out.println("xóa thành công");
                    }
                    isExist = true;
                    break;
                }
            }
            try {
                if (!isExist) {
                    throw new NotFoundPhoneException("Không tìm thấy điện thoại!!!");
                }
            } catch (NotFoundPhoneException e) {
                System.out.println(e.getMessage());
            }
        } while (!isExist);
    }

    @Override
    public void display() {
        List<Phone> phoneList = ReadWritePhoneFileUtil.readPhoneFile(PATH);
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }

    @Override
    public void find() {
        List<Phone> phoneList = ReadWritePhoneFileUtil.readPhoneFile(PATH);

        System.out.println("Mời bạn nhập mã tài khoản hoặc tên chủ tài khoản cần tìm kiếm: ");
        String find = SCANNER.nextLine();
        boolean isExist = false;

        for (Phone phone : phoneList) {
            if (Integer.toString(phone.getId()).contains(find) || phone.getPhoneName().toLowerCase().contains(find.toLowerCase())) {
                System.out.println(phone);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }
}
