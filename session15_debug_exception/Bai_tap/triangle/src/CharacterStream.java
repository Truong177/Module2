import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        String fileName = "session16.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, world!\n");
            System.out.println("Dữ liệu đã được ghi vào tệp " + fileName);
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
