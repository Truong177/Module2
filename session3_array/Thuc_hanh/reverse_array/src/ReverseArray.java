import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20) ;
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Phần tử thứ  " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        reverseArray(array);
        System.out.print("\nMảng đã đảo: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

