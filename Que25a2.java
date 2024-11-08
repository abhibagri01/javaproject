import java.util.Scanner;

// Custom exception for invalid credentials
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined username and password
        String correctUsername = "user123";
        String correctPassword = "password123";

        try {
            // Get username and password input from the user
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Check if the username is less than 6 characters
            if (username.length() < 6) {
                throw new InvalidCredentialsException("Username must be at least 6 characters long.");
            }

            // Check if the password matches the predefined one
            if (!password.equals(correctPassword)) {
                throw new InvalidCredentialsException("Password does not match.");
            }

            // If all conditions are met
            System.out.println("Login successful!");

        } catch (InvalidCredentialsException e) {
            // Print the error message from the exception
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
