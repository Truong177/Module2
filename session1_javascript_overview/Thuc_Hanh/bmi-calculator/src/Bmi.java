import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi ;
        System.out.println("Nhập cân nặng ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("Chỉ số bmi là " +bmi);
        if (bmi < 18){
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
