package final_module.service.impl;

import final_module.exception.NotFoundRegisterException;
import final_module.model.Register;
import final_module.model.Vehicle;
import final_module.service.IOtoService;
import final_module.utils.ReadWriteRegisterFile;
import final_module.utils.ReadWriteVehicleFile;

import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/final_module/data/vehicle.csv";

    @Override
    public void display() {
        List<Vehicle> vehicleList = ReadWriteVehicleFile.readVehicleFile(PATH);
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

    @Override
    public void remove() {
        List<Register> registerList = ReadWriteRegisterFile.readRegisterFile(PATH);
        boolean isExist = false;
        int codeRemove;

        do {
            System.out.println("Mời bạn nhập số đăng ký cần xóa: ");
            codeRemove = Integer.parseInt(SCANNER.nextLine());

            for (Register register : registerList) {
                if (codeRemove == (register.getRegisterNumber())) {
                    System.out.println("phương tiện cần xóa: ");
                    System.out.println(register);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String chooseYesNo = SCANNER.nextLine();

                    if (chooseYesNo.equals("1")) {
                        registerList.remove(register);
                        ReadWriteRegisterFile.writeRegisterFile(PATH, registerList);
                        System.out.println("Xóa thành công!");
                    }
                    isExist = true;
                    break;
                }
            }

            try {
                if (!isExist) {
                    throw new NotFoundRegisterException("Tài khoản không tồn tại!");
                }
            } catch (NotFoundRegisterException e) {
                System.out.println(e.getMessage());
            }
        } while (!isExist);
    }
}
