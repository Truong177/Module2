import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final String FILE_NAME = "products.dat";

    public void add(Product product) {
        List<Product> products = readProductsFromFile();
        products.add(product);
        writeProductsToFile(products);
    }

    public List<Product> getAllProduct() {
        return readProductsFromFile();
    }

    public Product searchProduct(int id) {
        List<Product> products = readProductsFromFile();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    private List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return products;
    }

    private void writeProductsToFile(List<Product> products) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
