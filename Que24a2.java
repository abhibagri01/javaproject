import java.util.Scanner;

// User-defined exception for when the candidate is too old
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// User-defined exception for when the candidate is too young
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input for candidate's name and age
            System.out.print("Enter candidate's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();

            // Check the age conditions
            if (age > 45) {
                throw new TooOlder("Candidate is too old for recruitment.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young for recruitment.");
            } else {
                // If age is within the acceptable range, print "Eligible" and candidate's name
                System.out.println("Eligible");
                System.out.println("Candidate's Name: " + name);
            }
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
