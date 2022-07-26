package case_study.controller;

import case_study.service.IHouseService;
import case_study.service.IRoomService;
import case_study.service.IVillaService;
import case_study.service.impl.HouseService;
import case_study.service.impl.RoomService;
import case_study.service.impl.VillaService;

import java.util.Scanner;

public class FacilityController {
    private final Scanner scanner = new Scanner(System.in);
    IVillaService villa = new VillaService();
    IHouseService house = new HouseService();
    IRoomService room = new RoomService();

    public void menuFacility() {
        do {
            System.out.println("Mời bạn chọn: \n" +
                    "1.Hiển thị danh sách cơ sở \n" +
                    "2.Thêm cơ sở mới \n" +
                    "3.Hiển thị danh sách cơ sở cần bảo trì \n" +
                    "4.Quay lại menu chính");

            int choose = 0;

            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    do {
                        System.out.println("Mời bạn nhập lựa chọn: \n" +
                                "1.Hiển thị danh sách villa \n" +
                                "2.Hiển thị danh sách house \n" +
                                "3.Hiển thị danh sách room ");

                        int choose2 = 0;
                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose2 = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }

                        switch (choose2) {
                            case 1:
                                villa.display();
                                break;
                            case 2:
                                house.display();
                                break;
                            case 3:
                                room.display();
                            case 4:
                                return;
                            default:
                                System.out.println("Vui lòng nhập lại!!!");
                        }
                    } while (true);

                case 2:
                    do {
                        System.out.println("Mời bạn nhập lựa chọn: \n" +
                                "1.Thêm villa \n" +
                                "2.Thêm house \n" +
                                "3.Thêm room ");

                        int choose3 = 0;

                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose3 = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }

                        switch (choose3) {
                            case 1:
                                villa.add();
                                break;
                            case 2:
                                house.add();
                                break;
                            case 3:
                                room.add();
                            case 4:
                                return;
                            default:
                                System.out.println("Vui lòng nhập lại!!!");
                        }
                    } while (true);
                case 3:
                    do {
                        System.out.println("Mời bạn nhập lựa chọn: \n" +
                                "1.Hiển thị danh sách villa cần sửa chữa \n" +
                                "2.Hiển thị danh sách house cần sửa chữa \n" +
                                "3.Hiển thị danh sách room cần sửa chữa ");

                        int choose4 = 0;

                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose4 = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }

                        switch (choose4) {
                            case 1:
                                villa.displayMaintenance();
                                break;
                            case 2:
                                house.displayMaintenance();
                                break;
                            case 3:
                                room.displayMaintenance();
                            case 4:
                                return;
                            default:
                                System.out.println("Vui lòng nhập lại!!!");
                        }
                    } while (true);
                case 4:
                    return;
                default:
                    System.err.println("Vui lòng nhập lại!!!");
            }
        } while (true);
    }
}
