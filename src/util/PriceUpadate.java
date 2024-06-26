package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUpadate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
