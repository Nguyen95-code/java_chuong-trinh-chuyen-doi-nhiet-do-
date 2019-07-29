import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Celsius");
            System.out.println("0. Exit");
            System.out.print("Enter the choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter the Celsius:");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit:" + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrebheit) {
        double celsius = (5.0 / 9) * (fahrebheit - 32);
        return celsius;
    }
}

