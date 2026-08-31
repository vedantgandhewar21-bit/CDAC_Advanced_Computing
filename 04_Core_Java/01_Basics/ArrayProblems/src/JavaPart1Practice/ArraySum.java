package JavaPart1Practice;


	public class ArraySum {
	    public static void main(String[] args) {
	        // Initialize an integer array with values
	        int[] numbers = {2, 4, 6, 8, 10};
	        
	        // Variable to store the running total
	        int sum = 0;
	        
	        // Loop through each element in the array
	        for (int num : numbers) {
	            sum += num; // Add the current number to the sum
	        }
	        
	        // Print the final result
	        System.out.println("The sum of the array elements is: " + sum);
	    }
	}


