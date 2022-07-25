package ss17_binary_file.exercise.product.controller;

import ss17_binary_file.exercise.product.service.IProductService;
import ss17_binary_file.exercise.product.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuController() {
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẨN PHẢM \n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Hiển thị danh sách sản phẩm \n" +
                    "3.Tìm kiếm sản phẩm \n" +
                    "4.Thoát khỏi chương trình ");

            int choose = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.out.println("Cảm ơn quý khách!");
                    System.exit(1);
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!!!");
            }
        } while (true);
    }
}
