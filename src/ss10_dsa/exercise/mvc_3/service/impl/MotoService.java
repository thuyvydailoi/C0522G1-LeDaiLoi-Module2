package ss10_dsa.exercise.mvc_3.service.impl;

import ss10_dsa.exercise.mvc_3.model.Moto;
import ss10_dsa.exercise.mvc_3.model.Truck;
import ss10_dsa.exercise.mvc_3.service.IMotoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotoService implements IMotoService {
    private static List<Moto> motoList = new ArrayList<Moto>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addMoto() {
        Moto moto = infoMoto();
        motoList.add(moto);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void displayMoto() {
        for (Moto moto : motoList) {
            System.out.println(moto);
        }
    }

    @Override
    public void removeMoto() {
        System.out.println("mời bạn nhập biển kiểm soát để xóa: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Moto moto : motoList) {
            if (input.equals(moto.getId())) {
                System.out.println("Bạn chắc chắn muốn xoá không \n" +
                        "1.Có \n" +
                        "2.Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    motoList.remove(moto);
                    System.out.println("Xoá thành công! ");
                }
                isFlag = true;
                break;
            }
        }
        if(!isFlag){
            System.out.println("Không tìm thấy biển số phù hợp!!!");
        }
    }

    @Override
    public void searchMoto() {
        System.out.println("mời bạn nhập biển kiểm soát để tìm kiếm: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Moto moto : motoList){
            if (input.equals(moto.getId())){
                System.out.println(moto);
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    private static Moto infoMoto() {
        System.out.println("Mời bạn nhập biển kiểm soát: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập người sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập tải trọng: ");
        String wattage = scanner.nextLine();
        Moto moto = new Moto(id, producer, year, owner, wattage);
        return moto;
    }
}
