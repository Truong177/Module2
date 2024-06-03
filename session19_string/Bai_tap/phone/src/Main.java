import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại:");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ: " + phoneNumber);
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }

        scanner.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
