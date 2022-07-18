package ss10_dsa.exercise.mvc_3.service.impl;

import ss10_dsa.exercise.mvc_3.service.ICarService;
import ss10_dsa.exercise.mvc_3.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static final List<Car> carList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addCar() {
        Car car = infoCar();
        carList.add(car);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void displayCar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void searchCar() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Car car : carList) {
            if (input.equals(car.getId())) {
                System.out.println(car);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    @Override
    public void removeCar() {
        System.out.println("Mời bạn nhập biển kiểm soát để xóa: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Car car : carList) {
            if (input.equals(car.getId())) {
                System.out.println("Bạn chắc chắn muốn xoá không? \n" +
                        "1. Có \n" +
                        "2.Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    carList.remove(car);
                    System.out.println("Xoá thành công! ");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số phù hợp!!!");
        }
    }

    private static Car infoCar() {
        System.out.println("Mời bạn nhập biển kiểm soát: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập người sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println("Mời bạn nhập số chổ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập kiểu xe: ");
        String model = scanner.nextLine();
        Car car = new Car(id, producer, year, owner, numberOfSeats, model);
        return car;

    }
}
