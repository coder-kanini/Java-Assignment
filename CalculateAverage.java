import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner faith= new Scanner(System.in);
                // Array to store marks of five units
        double[] marks = new double[5];
                // Ask user to enter marks for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = faith.nextDouble();
        }
                // Calculate the average of marks
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        double average = sum / marks.length;
                // Print the average with two decimal places
        System.out.printf("The average marks of the five units is: %.2f\n", average);
                // Close the scanner
        faith.close();
    }
}
