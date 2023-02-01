package final_module.service.impl;

import final_module.model.Register;
import final_module.service.IRegisterService;
import final_module.utils.ReadWriteRegisterFile;

import java.util.List;
import java.util.Scanner;

public class RegisterService implements IRegisterService {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/final_module/data/register.csv";

    @Override
    public void add() {
        List<Register> registerList = ReadWriteRegisterFile.readRegisterFile(PATH);

        System.out.println("Mời nhập số đăng ký: ");
        int registerNumber = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Mời nhập chủ sở hữu: ");
        String owner = SCANNER.nextLine();

        System.out.println("Mời nhập ngày đăng ký: ");
        String dateCreated = SCANNER.nextLine();

        System.out.println("Nhập mã phương tiên: ");
        String id = SCANNER.nextLine();

        registerList.add(new Register(registerNumber, owner, dateCreated, id));
        ReadWriteRegisterFile.writeRegisterFile(PATH, registerList);
        System.out.println("Thêm mới thành công!");
    }
}
