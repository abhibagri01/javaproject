import java.util.Scanner;

// User-defined exception for when the temperature is too hot
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// User-defined exception for when the temperature is too cold
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the temperature input from the user
            System.out.print("Enter the temperature in Celsius: ");
            double temperature = scanner.nextDouble();

            // Check for temperature conditions
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                // If the temperature is within the normal range
                System.out.println("Temperature is Normal.");
                // Convert to Fahrenheit and display
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
