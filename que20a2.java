public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Generate NegativeArraySizeException
            int[] array = new int[-5]; // Attempting to create an array with a negative size
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        try {
            // Generate ArithmeticException
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
