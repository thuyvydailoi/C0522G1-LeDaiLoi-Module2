package ss10_dsa.exercise.mvc_3.service.impl;

import ss10_dsa.exercise.mvc_3.model.Truck;
import ss10_dsa.exercise.mvc_3.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static final List<Truck> truckList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addTruck() {
        Truck truck = infoTruck();
        truckList.add(truck);
        System.out.println(truck);
    }

    @Override
    public void displayTruck() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruck() {
        System.out.println("mời bạn nhập biển kiểm soát để xoá: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (input.equals(truck.getId())) {
                System.out.println("Bạn chắc chắn muốn xoá không \n" +
                        "1.Có \n" +
                        "2.Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    truckList.remove(truck);
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
    public void searchTruck() {
        System.out.println("mời bạn nhập biển kiểm soát để tìm kiếm: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Truck truck : truckList){
            if(input.equals(truck.getId())){
                System.out.println(truck);
                isFlag =true;
                break;
            }
        }
        if(!isFlag){
            System.out.println("Không timf thấy biển số xe");
        }
    }

    private static Truck infoTruck() {
        System.out.println("Mời bạn nhập biển kiểm soát: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập người sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập tải tronngj của xe: ");
        String loadWeight = scanner.nextLine();
        Truck truck = new Truck(id, producer, year, owner, loadWeight);
        return truck;
    }
}
