import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Nhập hình cầm tìm ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Nhập chiều dài ");
                    int length = scanner.nextInt();
                    System.out.println("Nhập chiều rộng ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
