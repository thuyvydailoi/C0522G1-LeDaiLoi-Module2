package ss10_dsa.exercise.mvc_3.controller;

import ss10_dsa.exercise.mvc_3.service.ICarService;
import ss10_dsa.exercise.mvc_3.service.IMotoService;
import ss10_dsa.exercise.mvc_3.service.ITruckService;
import ss10_dsa.exercise.mvc_3.service.impl.CarService;
import ss10_dsa.exercise.mvc_3.service.impl.MotoService;
import ss10_dsa.exercise.mvc_3.service.impl.TruckService;

import java.util.Scanner;

public class VehicleSearchController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICarService car = new CarService();
    private static final IMotoService moto = new MotoService();
    private static final ITruckService truck = new TruckService();

    public void menuSearchVehicle(){
        do{
            System.out.println("Tìm kiếm phương tiên theo biển kiểm soát: \n" +
                    "1. Tìm kiếm ô tô \n" +
                    "2.Tìm kiếm xe máy \n" +
                    "3. Tìm kiếm xe tải \n" +
                    "4. Quay lại menu chính ");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose){
                case 1:
                    car.searchCar();
                    break;
                case 2:
                    moto.searchMoto();
                case 3:
                    truck.searchTruck();
                case 4:
                    return;
            }
        } while (true);
    }
}
