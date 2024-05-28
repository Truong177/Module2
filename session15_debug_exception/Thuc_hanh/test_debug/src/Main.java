import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất ax + b = 0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        if (a != 0) {
            double experience = -b / a;
            System.out.println("Phương trình có nghiệm " +experience);
        }else {
            if (b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}