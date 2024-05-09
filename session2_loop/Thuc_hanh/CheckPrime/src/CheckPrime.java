import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ");
        int num = scanner.nextInt();
        if (num < 2){
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Là số nguyên tố");
            } else {
                System.out.println("Không phải số nguyên tố");
            }
        }
    }
}
