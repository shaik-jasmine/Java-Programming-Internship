import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter!");

        while (true) {
            System.out.println("\nselect an option :");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting Temperature Converter. Goodbye!");
                break;
            }

            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();
            double convertedTemperature;

            switch (choice) {
                case 1:
                    convertedTemperature = celsiusToFahrenheit(temperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                    break;
                case 2:
                    convertedTemperature = fahrenheitToCelsius(temperature);
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                    break;
                case 3:
                    convertedTemperature = celsiusToKelvin(temperature);
                    System.out.println("Temperature in Kelvin: " + convertedTemperature);
                    break;
                case 4:
                    convertedTemperature = kelvinToCelsius(temperature);
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                    break;
                case 5:
                    convertedTemperature = fahrenheitToKelvin(temperature);
                    System.out.println("Temperature in Kelvin: " + convertedTemperature);
                    break;
                case 6:
                    convertedTemperature = kelvinToFahrenheit(temperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }
}
