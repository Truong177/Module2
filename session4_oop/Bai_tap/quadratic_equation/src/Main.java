import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double root = equation.getDiscriminant();
        if (root > 0){
            double root1 = equation.getRoot1();;
            double root2 = equation.getRoot2();
            System.out.println("Hai nghiệm của phương trình là: ");
            System.out.println("Nghiệm 1 = " + root1);
            System.out.println("Nghiệm 2 = " + root2);
        }else if (root == 0){
            double root3 = equation.getRoot1();
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("Nghiệm = " + root3);
        }else {
            System.out.println("Phương trình vô nghiệm ");

        }    }
}