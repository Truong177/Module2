package repositories;

import models.Product;

public class ProductManagerRepository {
    private static Product[] products = new Product[100];
    private static int count = 0;

    static {
        products[0] = new Product(1, "MSI", 100000000);
        count = 1;
    }


    public static void add(Product product) {
        products[count] = product;
        count++;
    }
}
