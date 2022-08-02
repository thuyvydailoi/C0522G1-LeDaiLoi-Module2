package case_study.service.impl;

import case_study.exception.*;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.service.IFacilityService;
import case_study.utils.MenuUtil;
import case_study.utils.ReadWriteFacilityUtil;

import java.util.Map;
import java.util.Scanner;

public class FalicityService implements IFacilityService {
    private static final String PATH_VILLA = "src/case_study/data/villa.csv";
    private static final String PATH_ROOM = "src/case_study/data/room.csv";
    private static final String PATH_HOUSE = "src/case_study/data/house.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    private void inputFacility(Facility facility) {
        Map<Facility, Integer> villaList = ReadWriteFacilityUtil.readFacilityFile(PATH_VILLA);
        Map<Facility, Integer> roomList = ReadWriteFacilityUtil.readFacilityFile(PATH_ROOM);
        Map<Facility, Integer> houseList = ReadWriteFacilityUtil.readFacilityFile(PATH_HOUSE);

        String idService;
        while (true) {
            try {
                System.out.println("Nhập mã dịch vụ: ");
                idService = SCANNER.nextLine();
                if (facility instanceof Villa) {
                    if (!idService.matches("^SVVL-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ," +
                                " vui lòng nhập theo định dạng SVVL-YYYY(với Y là số từ 0-9)!!!");
                    }
                    for (Facility villa : villaList.keySet()) {
                        if (idService.equals(villa.getIdService())) {
                            throw new DuplicateIdException("Mã dịch vụ đã tồn tại," +
                                    " vui lòng nhập lại!!!");
                        }
                    }
                } else if (facility instanceof House) {
                    if (!idService.matches("^SVHO-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ," +
                                " vui lòng nhập theo định dạng SVHO-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility house : houseList.keySet()) {
                        if (idService.equals(house.getIdService())) {
                            throw new DuplicateIdException("Mã dịch vụ đã tồn tại, vui lòng nhập lại");
                        }
                    }
                } else {
                    if (!idService.matches("^SVRO-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ," +
                                " vui lòng nhập theo định dạng SVRO-YYYY(với Y là số từ 0-9)!!!");
                    }

                    for (Facility room : roomList.keySet()) {
                        if (idService.equals(room.getIdService())) {
                            throw new DuplicateIdException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }
                }
                break;
            } catch (IdServiceFormatException | DuplicateIdException e) {
                System.out.println(e.getMessage());
            }
        }


        String nameService;
        while (true) {
            try {
                System.out.println("Nhập tên dịch vụ: ");
                nameService = SCANNER.nextLine();
                if (nameService.matches("^[A-z][a-z]+([a-z]+)*$")) {
                    throw new TextFormatException("Tên dịch vụ phải viết hoa ký tự đầu,còn lại là ký tự thường!");
                }
                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double area;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng(m2): ");
                area = Double.parseDouble(SCANNER.nextLine());
                if (area <= 30) {
                    throw new AreaInvalidException("Diện tích sử dụng là số thực và lớn hơn 30m2!");
                }
                break;
            } catch (NumberFormatException | AreaInvalidException e) {
                System.out.println("Vui lòng nhập số!!!");
            }
        }

        int price;
        while (true) {
            try {
                System.out.println("Nhập giá thuê(VNĐ): ");
                price = Integer.parseInt(SCANNER.nextLine());
                if (price <= 0) {
                    throw new PriceInvalidException("Giá thuê phải là số dương!!!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            } catch (PriceInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        int numberOfPeople;
        while (true) {
            try {
                System.out.println("Nhập số người tối đa: ");
                numberOfPeople = Integer.parseInt(SCANNER.nextLine());
                if (numberOfPeople <= 0 || numberOfPeople >= 20) {
                    throw new NumberOfPeopleInvalidException("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!!!");
            } catch (NumberOfPeopleInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        String rentalType = MenuUtil.getRentalType();

        facility.setIdService(idService);
        facility.setNumberOfPeople(numberOfPeople);
        facility.setPrice(price);
        facility.setNameService(nameService);
        facility.setArea(area);
        facility.setRentalType(rentalType);
    }

    @Override
    public void display() {
        System.out.println("\nDanh sách cơ sở: ");

        System.out.println("1. Danh sách biệt thự: ");
        Map<Facility, Integer> villaList = ReadWriteFacilityUtil.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + ",\tSố lần sử dụng: " + villaList.get(villa));
        }

        System.out.println("2. Danh sách nhà: ");
        Map<Facility, Integer> houseList = ReadWriteFacilityUtil.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            System.out.println(house + ",\tSố lần sử dụng: " + houseList.get(house));
        }

        System.out.println("3. Danh sách phòng: ");
        Map<Facility, Integer> roomList = ReadWriteFacilityUtil.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + ",\tSố lần sử dụng: " + roomList.get(room));
        }
    }

    @Override
    public void add() {
        while (true) {
            System.out.println("Thêm cơ sở:\n" +
                    "1. Thêm biệt thự.\n" +
                    "2. Thêm nhà.\n" +
                    "3. Thêm phòng.\n" +
                    "4. Trở về menu chính.");
            int choice = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choice = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choice) {
                case 1:
                    Map<Facility, Integer> villaList = ReadWriteFacilityUtil.readFacilityFile(PATH_VILLA);
                    Villa villa = new Villa();
                    inputFacility(villa);

                    System.out.print("Nhập tiêu chuẩn phòng: ");
                    String standardVilla = SCANNER.nextLine();

                    double poolArea;
                    while (true) {
                        try {
                            System.out.print("Nhập diện tích hồ bơi: ");
                            poolArea = Double.parseDouble(SCANNER.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }
                    }

                    int numberOfFloorsVilla;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsVilla = Integer.parseInt(SCANNER.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }
                    }

                    villa.setStandard(standardVilla);
                    villa.setArea(poolArea);
                    villa.setNumberOfFloor(numberOfFloorsVilla);

                    villaList.put(villa, 0);
                    ReadWriteFacilityUtil.writeFacilityFile(PATH_VILLA, villaList);
                    System.out.println("Thêm mới Biệt thự thành công!");
                    break;
                case 2:
                    Map<Facility, Integer> houseList = ReadWriteFacilityUtil.readFacilityFile(PATH_HOUSE);
                    House house = new House();
                    inputFacility(house);

                    System.out.print("Nhập tiêu chuẩn phòng: ");
                    String standardHouse = SCANNER.nextLine();

                    int numberOfFloorsHouse;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsHouse = Integer.parseInt(SCANNER.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        }
                    }

                    house.setStandard(standardHouse);
                    house.setNumberOfFloors(numberOfFloorsHouse);

                    houseList.put(house, 0);
                    ReadWriteFacilityUtil.writeFacilityFile(PATH_HOUSE, houseList);
                    System.out.println("Thêm mới Nhà thành công!");
                    break;
                case 3:
                    Map<Facility, Integer> roomList = ReadWriteFacilityUtil.readFacilityFile(PATH_ROOM);
                    Room room = new Room();
                    inputFacility(room);

                    System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceIncluded = SCANNER.nextLine();

                    room.setFreeService(freeServiceIncluded);
                    roomList.put(room, 0);
                    ReadWriteFacilityUtil.writeFacilityFile(PATH_ROOM, roomList);
                    System.out.println("Thêm mới Phòng thành công!");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        }
    }

    @Override
    public void displayMaintenance() {
        System.out.println("Danh sách bảo trì cơ sở: ");

        System.out.println("1. Danh sách bảo trì biệt thự: ");
        Map<Facility, Integer> villaList = ReadWriteFacilityUtil.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            if (villaList.get(villa) > 4) {
                System.out.println(villa + "\tSố lần sử dụng: " + villaList.get(villa));
            }
        }

        System.out.println("2. Danh sách bảo trì nhà: ");
        Map<Facility, Integer> roomList = ReadWriteFacilityUtil.readFacilityFile(PATH_ROOM);
        for (Facility house : roomList.keySet()) {
            if (roomList.get(house) > 4) {
                System.out.println(house + ",\tSố lần sử dụng: " + roomList.get(house));
            }
        }

        System.out.println("3. Danh sách bảo trì nhà: ");
        Map<Facility, Integer> houseList = ReadWriteFacilityUtil.readFacilityFile(PATH_HOUSE);
        for (Facility room : houseList.keySet()) {
            if (roomList.get(room) > 4) {
                System.out.println(room + ",\tSố lần sử dụng: " + houseList.get(room));
            }
        }
    }
}

