import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner faith = new Scanner(System.in);
        
        // Ask user to enter an integer
        System.out.print("Enter an integer: ");
        int number = faith.nextInt();
        
        // Check divisibility by numbers 0-9
        boolean divisible = false;
        String result = "The number is divisible by: ";
        
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                divisible = true;
                result += i + ", ";
            }
        }
        
        // Print the result
        if (divisible) {
            System.out.println(result.substring(0, result.length() - 2)); // Remove trailing comma and space
        } else {
            System.out.println("The number is not divisible by any number from 1 to 9.");
        }
        
        // Close the scanner
        faith.close();
    }
}
