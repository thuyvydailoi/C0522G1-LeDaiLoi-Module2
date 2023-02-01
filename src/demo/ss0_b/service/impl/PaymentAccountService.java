package demo.ss0_b.service.impl;

import demo.ss0_b.exception.NotFoundBankAccountException;
import demo.ss0_b.exception.NumberInvalidException;
import demo.ss0_b.model.BankAccount;
import demo.ss0_b.model.PaymentBankAccount;
import demo.ss0_b.service.IPaymentAccountService;
import demo.ss0_b.utils.ReadWriteBankFileUtil;

import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IPaymentAccountService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/demo/ss0_b/data/bank_accounts.csv";

    @Override
    public void add() {
        List<BankAccount> bankAccountList = ReadWriteBankFileUtil.readBankAccountFile(PATH);

        int id;
        if (bankAccountList.size() == 0) {
            id = 1;
        } else {
            id=bankAccountList.get(bankAccountList.size()-1).getId()+1;
        }

//        int id = bankAccountList.get(bankAccountList.size() - 1).getId() + 1;

        System.out.println("Nhập mã tài khoản: ");
        String code = SCANNER.nextLine();

        System.out.println("Nhập tên chủ tài khoản: ");
        String name = SCANNER.nextLine();

        System.out.println("Nhập ngày tạo tài khoản: ");
        String dateCreated = SCANNER.nextLine();

        System.out.println("Nhập số tài khoản: ");
        int numberCard;
        do {
            try {
                numberCard = Integer.parseInt(SCANNER.nextLine());
                if (numberCard <= 0) {
                    throw new NumberInvalidException("Vui lòng nhập số dương!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberInvalidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Nhập số tiền trong tài khoản (VNĐ): ");
        int money;
        do {
            try {
                money = Integer.parseInt(SCANNER.nextLine());
                if (money <= 0) {
                    throw new NumberInvalidException("Vui lòng nhập số dương!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberInvalidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);


        bankAccountList.add(new PaymentBankAccount(id, code, name, dateCreated, numberCard, money));
        ReadWriteBankFileUtil.writeBankAccountFile(PATH, bankAccountList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        List<BankAccount> bankAccountList = ReadWriteBankFileUtil.readBankAccountFile(PATH);
        boolean isExist = false;
        String codeRemove;

        do {
            System.out.println("Mời bạn nhập mã tài khoản cần xóa: ");
            codeRemove = SCANNER.nextLine();

            for (BankAccount bankAccount : bankAccountList) {
                if (codeRemove.equals(bankAccount.getCode())) {
                    System.out.println("Tài khoản cần xóa: ");
                    System.out.println(bankAccount);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String chooseYesNo = SCANNER.nextLine();

                    if (chooseYesNo.equals("1")) {
                        bankAccountList.remove(bankAccount);
                        ReadWriteBankFileUtil.writeBankAccountFile(PATH, bankAccountList);
                        System.out.println("Xóa thành công!");
                    }
                    isExist = true;
                    break;
                }
            }

            try {
                if (!isExist) {
                    throw new NotFoundBankAccountException("Tài khoản không tồn tại!");
                }
            } catch (NotFoundBankAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!isExist);
    }

    @Override
    public void display() {
        List<BankAccount> bankAccountList = ReadWriteBankFileUtil.readBankAccountFile(PATH);
        for (BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount);
        }

    }

    @Override
    public void find() {
        List<BankAccount> bankAccountList = ReadWriteBankFileUtil.readBankAccountFile(PATH);

        System.out.println("Mời bạn nhập mã tài khoản hoặc tên chủ tài khoản cần tìm kiếm: ");
        String find = SCANNER.nextLine();
        boolean isExist = false;

        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getCode().contains(find) || bankAccount.getName().toLowerCase().contains(find.toLowerCase())) {
                System.out.println(bankAccount);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }
}
