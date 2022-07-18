package ss12_map.exercise.product.service.impl;

import ss12_map.exercise.product.model.Product;
import ss12_map.exercise.product.service.IProductService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final List<Product> productList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void editProduct() {
        System.out.println("Mời bạn nhập sản phẩm cần thay đổi");
        String input = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (input.equals(productList.get(i).getId())) {
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá mới: ");
                double price = Double.parseDouble(scanner.nextLine());
                Product product = new Product(productList.get(i).getId(), name, price);
                productList.set(i, product);
                System.out.println("Đã chỉnh sửa thành công");
            }
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Mời bạn nhập sản phẩm cần xoá: ");
        String input = scanner.nextLine();

        for (Product product : productList) {
            if (input.equals(product.getId())) ;
            {
                System.out.println("Bạn có chắc chắn muốn xoá không? \n" +
                        "1.Có \n" +
                        "2.Không");

                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Đã xoá thành công!!!");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy sản phầm phù hợp");

    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void searchProduct() {
        System.out.println("Mời bạn nhập phương tiện cần tìm kiếm: ");
        String input = scanner.nextLine();
        boolean isFlag = false;
        for (Product product : productList) {
            if (input.equals(product.getName())) {
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sản phầm cần tìm kiếm!!!");
        }
    }

    @Override
    public void sortProduct() {
        Scanner scanner = new Scanner(System.in);
        PriceAscending priceAscending = new PriceAscending();
        PriceDescending priceDescending = new PriceDescending();
        do {
            System.out.println("Mời bạn chọn cách sắp xếp: \n" +
                    "1.Sắp xếp tăng dần \n" +
                    "2.Sắp xếp giảm dần \n" +
                    "3.Quay trở lại menu ");
            System.out.println("Mời bạn lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productList.sort(priceAscending);
                case 2:
                    productList.sort(priceDescending);
                case 3:
                    return;
            }
        } while (true);

    }

    private static Product infoProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá của sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
