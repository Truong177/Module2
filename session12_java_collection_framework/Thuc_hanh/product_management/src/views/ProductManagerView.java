package views;

import models.Product;

import java.util.Scanner;

public class ProductManagerView {
    public int view(){
        System.out.println("--------Product Manager--------");
        System.out.println("1: Add product");
        System.out.println("2: Edit product");
        System.out.println("3: Delete product");
        System.out.println("4: Display product");
        System.out.println("5: Search product");
        System.out.println("6: Sort product");
        System.out.println("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;

    }

    public Product viewAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your code ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Input your name ");
        String name = scanner.nextLine();
        System.out.println("Input your price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(code,name,price);
        return product;
    }

    public void viewMessege(boolean result) {
        if (result){
            System.out.println("Tác vụ thành công");
        }else {
            System.out.println("Tác vụ thất bại ");
        }
    }
}
