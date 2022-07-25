package ss17_binary_file.exercise.product.service.impl;

import ss17_binary_file.exercise.product.exception.ProductException;
import ss17_binary_file.exercise.product.model.Product;
import ss17_binary_file.exercise.product.service.IProductService;
import ss17_binary_file.exercise.product.utils.WriteReadProductFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/ss17_binary_file/exercise/product/data/product.csv";


    @Override
    public void add() {
        List<Product> productList = WriteReadProductFile.readProductFile(PATH);
        Product product = infoProduct();
        productList.add(product);
        WriteReadProductFile.writeProductFile(PATH, productList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void display() {
        List<Product> productList = WriteReadProductFile.readProductFile(PATH);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        List<Product> productList = WriteReadProductFile.readProductFile(PATH);

        System.out.println("Mời bạn nhập phương tiện cần tìm kiếm: ");
        String input = scanner.nextLine();
        boolean isExist = false;
        for (Product product : productList) {
            if (input.equals(product.getName())) {
                System.out.println(product);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sản phẩm cần tìm kiếm!!!");
        }
    }

    private static Product infoProduct() {
        List<Product> productList = WriteReadProductFile.readProductFile(PATH);
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new ProductException("Trùng id, vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Mời bạn nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập hãng sản xuất: ");
        String producer = scanner.nextLine();

        System.out.println("Mời nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, producer, price);
    }
}