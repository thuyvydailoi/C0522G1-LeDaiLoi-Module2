package ss10_dsa.exercise.mvc_3.controller;

import ss10_dsa.exercise.mvc_3.service.ICarService;
import ss10_dsa.exercise.mvc_3.service.IMotoService;
import ss10_dsa.exercise.mvc_3.service.ITruckService;
import ss10_dsa.exercise.mvc_3.service.impl.CarService;
import ss10_dsa.exercise.mvc_3.service.impl.MotoService;
import ss10_dsa.exercise.mvc_3.service.impl.TruckService;

import java.util.Scanner;

public class VehicleDisplayController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICarService car = new CarService();
    private static final IMotoService moto = new MotoService();
    private static final  ITruckService truck = new TruckService();

    public void menuDisplayVehicle(){
        do {
            System.out.println("Hiển thị phương tiện: \n" +
                    "1. Hiển thị xe ô tô \n" +
                    "2. Hiển thị xe máy \n" +
                    "3. Hiển thị xe tải \n" +
                    "4. Quay lại menu chính");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    car.displayCar();
                case 2:
                    moto.displayMoto();
                case 3:
                    truck.displayTruck();
                case 4:
                    return;
            }
        } while (true);
    }
}
