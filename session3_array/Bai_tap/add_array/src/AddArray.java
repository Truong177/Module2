import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập số cần chèn (X): ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí index cần chèn X vào trong mảng: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
        }
        System.out.println("Mảng sau khi chèn phần tử X:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}