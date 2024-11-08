import java.util.Scanner;

// Custom Exception for handling specific arithmetic errors
class CalculationException extends Exception {
    public CalculationException(String message) {
        super(message);
    }
}

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();

            System.out.print("Enter value for b (denominator): ");
            int b = scanner.nextInt();

            System.out.print("Enter value for c: ");
            int c = scanner.nextInt();

            // Calculate the equation a / b + c
            int result = calculateEquation(a, b, c);
            System.out.println("The result of the equation is: " + result);
        } catch (CalculationException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("General Arithmetic Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to calculate the equation and handle specific arithmetic issues
    public static int calculateEquation(int a, int b, int c) throws CalculationException {
        // Check for division by zero
        if (b == 0) {
            throw new CalculationException("Division by zero is not allowed.");
        }

        // Perform division and addition
        int divisionResult = a / b;

        // Check for overflow
        if ((long)divisionResult + c > Integer.MAX_VALUE) {
            throw new CalculationException("Overflow error: Result exceeds maximum integer value.");
        }

        // Return final result if no exceptions were thrown
        return divisionResult + c;
    }
}
