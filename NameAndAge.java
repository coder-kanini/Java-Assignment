import java.util.Scanner;

public class NameAndAge{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner faith= new Scanner(System.in);
        
        // Prompt the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = faith.nextLine();
        
        // Prompt the user to enter their current age
        System.out.print("Enter your current age: ");
        int age = faith.nextInt();
        
        // Close the Scanner to prevent resource leak
        faith.close();
        
        // Calculate the number of characters in the surname
        int numCharacters = surname.length();
        
        // Print the number of characters in the surname
        System.out.println("The number of characters in your surname is: " + numCharacters);
        
        // Determine if the age is odd or even
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        // Print whether the age is odd or even
        System.out.println("Your current age is an " + ageType + " number");
    }
}
