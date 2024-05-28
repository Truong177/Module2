package services;

import models.Product;

public interface ISProductManagerService {
    boolean add(Product product);

    Product findByCode(int code);

    void removeProduct(Product product);
}
