import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money ;
        double rate ;
        int month ;
        double total =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất ");
        rate = scanner.nextDouble();
        for (int i = 0; i < month; i++) {
            total += money * (rate/100)/12 * month;
        }
        System.out.println("Số tiền lãi suất " +total);
    }
}
