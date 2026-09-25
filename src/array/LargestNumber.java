package array;

public class LargestNumber {

	public static void main(String[] args) {
		// Create array
        int[] numbers = {10, 40, 20, 50, 30};

        // Assume first number is largest
        int largest = numbers[0];

        // Check every number
        for (int i = 1; i < numbers.length; i++) {

            // Update largest value
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print result
        System.out.println("Largest Number: " + largest);
    }
}

