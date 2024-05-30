import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1, "LapTop", 30000000, "Asus", "New");
        Product product2 = new Product(2, "SmartPhone", 20000000, "Iphone", "New");
        Product product3 = new Product(3, "HeadPhone", 10000000, "Razer", "LikeNew");

        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);

        System.out.println("Tất cả sản phẩm:");
        List<Product> products = productManager.getAllProduct();
        for (Product product : products) {
            System.out.println(product);
        }

        int searchedProductId = 2;
        Product search = productManager.searchProduct(searchedProductId);
        if (search != null) {
            System.out.println("Tìm thấy sản phẩm: " + search);
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }

    }
}
