package ss12_map.exercise.product.controller;

import ss12_map.exercise.product.service.IProductService;
import ss12_map.exercise.product.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuController() {
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM \n" +
                    "1.Thêm sản phẩm \n" +
                    "2.Sửa thông tin sản phẩm \n" +
                    "3.Xoá sản phẩm \n" +
                    "4.Hiển thị danh sách sản phẩm \n" +
                    "5.Tìm kiếm sản phẩm  \n" +
                    "6.Sắp xếp sản phẩm tăng dần,giảm dần \n" +
                    "7.Thoát khỏi cương trình");
            System.out.println("Mời bạn lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;

                case 6:
                    iProductService.sortProduct();
                    break;

                case 7:
                    System.out.println("Cảm ơn quý khách!");
                    System.exit(1);
            }
        } while (true);
    }
}
