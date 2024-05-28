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

    public static Product findByCode(int code) {
        for (Product product : products) {
            if (product == null) {
                return null;
            }
            if (product.getCode() == code) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i] != null && products[i].getCode() == product.getCode()) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                return;
            }
        }
    }

}
