package ss17_binary_file.exercise.product.view;

import ss17_binary_file.exercise.product.controller.ProductController;
import ss17_binary_file.exercise.product.model.Product;
import ss17_binary_file.exercise.product.utils.WriteReadProductFile;

import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"NemVuong","DAILOICAPITAL",500.000));
        WriteReadProductFile.writeProductFile("src/ss17_binary_file/exercise/product/data/product.csv",productList);
        ProductController.menuController();
    }
}
