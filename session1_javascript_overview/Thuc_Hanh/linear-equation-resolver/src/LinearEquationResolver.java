import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Phương trình bậc nhất y = a * x + b ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("y : ");
        double y = scanner.nextDouble();
        if(a != 0){
            double answer = (y - b)/a;
            System.out.println("Phương trình có nghiệm là  x = " +answer);
        }else {
            if (b == y){
                System.out.println("Vô số nghiệm");
            }else{
                System.out.println("Vô nghiệm ");
            }
        }
    }
}
