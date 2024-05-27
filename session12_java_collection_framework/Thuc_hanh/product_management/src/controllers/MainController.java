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
        while (true){
            choice = productManagerView.view();
            switch (choice){
                case 1:
                    product = productManagerView.viewAdd();
                    result = productManagerService.add(product);
                    productManagerView.viewMessege(result);
                case 2:
                    break;
                case 3:
                    
            }
        }
    }
}