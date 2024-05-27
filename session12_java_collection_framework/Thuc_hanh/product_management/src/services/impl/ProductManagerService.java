package services.impl;

import models.Product;
import repositories.ProductManagerRepository;
import services.ISProductManagerService;

public class ProductManagerService implements ISProductManagerService {
    private ProductManagerRepository productManagerRepository = new ProductManagerRepository();

    @Override
    public boolean add(Product product) {
        if (product.getName().equals("")) {
            return false;
        }
        if (product.getCode() < 0) {
            return false;
        }
        ProductManagerRepository.add(product);
        return true;
    }
}
