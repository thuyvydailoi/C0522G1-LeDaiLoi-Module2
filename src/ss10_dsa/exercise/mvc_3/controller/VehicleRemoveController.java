package ss10_dsa.exercise.mvc_3.controller;

import ss10_dsa.exercise.mvc_3.service.ICarService;
import ss10_dsa.exercise.mvc_3.service.IMotoService;
import ss10_dsa.exercise.mvc_3.service.ITruckService;
import ss10_dsa.exercise.mvc_3.service.impl.CarService;
import ss10_dsa.exercise.mvc_3.service.impl.MotoService;
import ss10_dsa.exercise.mvc_3.service.impl.TruckService;

import java.util.Scanner;

public class VehicleRemoveController {
    private Scanner scanner = new Scanner(System.in);
    ICarService car = new CarService();
    IMotoService moto = new MotoService();
    ITruckService truck = new TruckService();

    public void menuRemoveVehicle() {
        do {
            System.out.println("Xoá phương tiện: \n" +
                    "1. Xoá ô tô \n" +
                    "2. Xoá xe máy \n" +
                    "3. Xoá xe tải \n" +
                    "4. Quay lại menu chính");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    car.removeCar();
                case 2:
                    moto.removeMoto();
                case 3:
                    truck.removeTruck();
                case 4:
                    return;
            }
        } while (true);
    }
}
