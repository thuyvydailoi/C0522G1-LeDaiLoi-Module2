package ss10_dsa.exercise.mvc_3.controller;

import ss10_dsa.exercise.mvc_3.service.ICarService;
import ss10_dsa.exercise.mvc_3.service.IMotoService;
import ss10_dsa.exercise.mvc_3.service.ITruckService;
import ss10_dsa.exercise.mvc_3.service.impl.CarService;
import ss10_dsa.exercise.mvc_3.service.impl.MotoService;
import ss10_dsa.exercise.mvc_3.service.impl.TruckService;

import java.util.Scanner;

public class VehicleAddController {
    private final Scanner scanner = new Scanner(System.in);
    ICarService car = new CarService();
    IMotoService moto = new MotoService();
    ITruckService truck = new TruckService();

    public void menuAddVehicle() {
        do {
            System.out.println("Mời bạn chọn loại phương tiện: \n" +
                    "1. Thêm ô tô\n" +
                    "2. Thêm xe máy\n" +
                    "3. Thêm xe tải\n" +
                    "4. Quay lại menu chính ");
            System.out.println("Mời bạn chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    car.addCar();
                    break;
                case 2:
                    moto.addMoto();
                    break;
                case 3:
                    truck.addTruck();
                case 4:
                    return;
            }
        } while(true);
    }
}
