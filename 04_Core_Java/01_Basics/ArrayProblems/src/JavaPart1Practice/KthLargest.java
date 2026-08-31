package JavaPart1Practice;

import java.util.Arrays;
//package JavaPart1Practice;

public class KthLargest {



    public static int findKthLargest(int[] nums, int k) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Return the element at the index representing the kth largest
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        int result = findKthLargest(numbers, k);
        
        // Print the final result
        System.out.println("The " + k + "nd largest element is: " + result);
    }
}
