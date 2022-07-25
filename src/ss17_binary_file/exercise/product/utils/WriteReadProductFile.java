package ss17_binary_file.exercise.product.utils;

import ss17_binary_file.exercise.product.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadProductFile {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
