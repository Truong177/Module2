import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp học:");
        String className = scanner.nextLine();
        if (isValidClassName(className)) {
            System.out.println("Tên lớp hợp lệ: " + className);
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
        scanner.close();
    }

    public static boolean isValidClassName(String className) {
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
