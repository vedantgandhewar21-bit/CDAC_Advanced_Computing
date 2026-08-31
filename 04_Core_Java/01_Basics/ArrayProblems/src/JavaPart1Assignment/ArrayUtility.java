package JavaPart1Assignment;

import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		System.out.println("Array Utility class");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a number  of elements: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print(" Enter a Number "+(i+1)+"  :");
			nums[i] = sc.nextInt();
			i++;
		}
		return nums;

	}
	public static void displayArray(int[] numArr) {
		int i=0;
		while(i<numArr.length) {
			System.out.print(numArr[i]+" ");
			i++;
		}
		
	}
}
