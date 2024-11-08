import java.util.Scanner;

// Custom exception for when no matching country is found
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine();

        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    // Method to return capital based on the country input
    public static String getCapital(String country) throws NoMatchFoundException {
        switch (country) {
            case "India":
                return "New Delhi";
            case "USA":
                return "Washington, D.C.";
            case "France":
                return "Paris";
            case "Japan":
                return "Tokyo";
            case "Germany":
                return "Berlin";
            default:
                // Throw custom exception if no match is found
                throw new NoMatchFoundException("No capital found for country: " + country);
        }
    }
