import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ hai");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ ba");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1,side2,side3);
    }
}