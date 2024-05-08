import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year ;
        System.out.println("Nhập năm : ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 ==0){
                    System.out.println(year +" Là năm nhuận");
                }else {
                    System.out.println(year +" Là năm không nhuận");
                }
            }else {
                System.out.println(year +" Là năm nhuận");
            }
        }else {
            System.out.println(year +" Là năm không nhuận");
        }
    }
}
