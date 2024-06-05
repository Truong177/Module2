package controllers;

import models.Product;
import services.ISProductManagerService;
import services.impl.ProductManagerService;
import views.ProductManagerView;

public class MainController {
    public static void main(String[] args) {
        ProductManagerView productManagerView = new ProductManagerView();
        ISProductManagerService productManagerService = new ProductManagerService();
        Product product;
        int choice;
        boolean result;
        int code;
        while (true) {
            choice = productManagerView.view();
            switch (choice) {
                case 1:
                    product = productManagerView.viewAdd();
                    result = productManagerService.add(product);
                    productManagerView.viewMessege(result);
                case 2:
                    code = ProductManagerView.inputCode();
                    product = productManagerService.findByCode(code);
                    if (product != null) {
                        Product updateProduct = productManagerView.viewEdit(product);
                        result = productManagerService.updateProduct(updateProduct);
                        productManagerView.viewMessege(result);
                    } else {
                        productManagerView.viewMessege(false);
                    }
                    break;
                case 3:
                    code = ProductManagerView.inputCode();
                    product = productManagerService.findByCode(code);
                    if (product == null) {
                        productManagerView.viewMessege(false);
                    } else {
                        boolean isConfirm = productManagerView.confirmDelete(product);
                        if (isConfirm) {
                            productManagerService.removeProduct(product);
                            productManagerView.viewMessege(true);

                        }
                        break;

                    }
                case 4:
                    Product[] products = productManagerService.getAll();
                    ProductManagerView.displayAllProduct(products);
                    break;
                case 5:
                    code = ProductManagerView.inputCode();
                    product = productManagerService.findByCode(code);
                    ProductManagerView.displayProduct(product);
                    break;
                case 6:
                    Product[] products1 = productManagerService.sortProduct();
                    ProductManagerView.displayAllProduct(products1);
                    break;
                case 0:
                    return;
            }
        }
    }
}
