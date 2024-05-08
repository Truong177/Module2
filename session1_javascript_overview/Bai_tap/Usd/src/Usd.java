import java.util.Scanner;

public class Usd {
    public static void main(String[] args) {
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD ");
        usd =scanner.nextDouble();
        double rate = usd * 23000;
        System.out.println("Gía trị VND là " +rate);
    }
}
