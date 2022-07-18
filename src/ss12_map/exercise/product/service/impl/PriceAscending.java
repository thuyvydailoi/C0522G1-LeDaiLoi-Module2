package ss12_map.exercise.product.service.impl;

import ss12_map.exercise.product.model.Product;

import java.util.Comparator;

public class PriceAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());
//        if(o1.getPrice() >= o2.getPrice()){
//            return 1;
//        } else {
//            return -1;
//        }

    }
}
