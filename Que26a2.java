import java.util.Scanner;

// User-defined exception for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input for name and age
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if age is negative
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }

            // If age is valid, print the name and age
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NegativeAgeException e) {
            // Handle the exception if age is negative
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
