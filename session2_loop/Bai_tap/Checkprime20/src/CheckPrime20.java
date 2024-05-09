import java.util.Scanner;

public class CheckPrime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            if (isPrime(n)) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
            for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
