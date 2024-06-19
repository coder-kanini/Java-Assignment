public class MultiplesRange {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 within the range 71 to 150:");
        
        // Iterate through numbers from 71 to 150
        for (int num = 71; num <= 150; num++) {
            // Check if num is a multiple of 2, 3, or 7
            if (num % 2 == 0 || num % 3 == 0 || num % 7 == 0) {
                System.out.println(num);
            }
        }
    }
}
