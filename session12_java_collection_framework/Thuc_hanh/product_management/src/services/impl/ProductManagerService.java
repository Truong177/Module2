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

    @Override
    public Product findByCode(int code) {
        return ProductManagerRepository.findByCode(code);
    }

    @Override
    public void removeProduct(Product product) {
        productManagerRepository.removeProduct(product);
    }

    @Override
    public Product[] getAll() {
        return ProductManagerRepository.getAll();
    }

    @Override
    public Product[] sortProduct() {
        return productManagerRepository.sortProduct();
    }

    @Override
    public boolean updateProduct(Product updateProduct) {
        return productManagerRepository.updateProduct(updateProduct);
    }
}
