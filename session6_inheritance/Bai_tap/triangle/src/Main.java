import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của ba cạnh của tam giác:");
        System.out.print("Cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();
        System.out.print("Cạnh thứ hai: ");
        double side2 = scanner.nextDouble();
        System.out.print("Cạnh thứ ba: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle("red", true, side1, side2, side3);
        System.out.println(triangle);
    }
}