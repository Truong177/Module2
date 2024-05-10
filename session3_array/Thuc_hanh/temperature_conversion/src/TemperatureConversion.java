import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius " + fahrenheitToCelsius(fahrenheit));
                case 2:
                    System.out.println("Enter Celsius ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit " + celsiusToFahrenheit(celsius));
                case 0:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("No choice!");

            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
