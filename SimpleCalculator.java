import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner faith = new Scanner(System.in);
        
        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = faith.nextDouble();
        
        // Ask user to enter the operation (+, -, *, /)
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = faith.next().charAt(0);
        
        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = faith.nextDouble();
        
        double result = 0;
        
        // Perform the operation based on the operator entered
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return; // Exit the program if division by zero
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return; // Exit the program if an invalid operation is entered
        }
        
        // Print the result
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
        
        // Close the scanner
        faith.close();
    }
}
