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
//	public static int[][] input2DArray() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public static int[][] input2DArray() {

	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter rows: ");
	    int rows = sc.nextInt();

	    System.out.print("Enter columns: ");
	    int columns = sc.nextInt();

	    int[][] arr = new int[rows][columns];

	    System.out.println("Enter elements:");

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < columns; j++) {
	            arr[i][j] = sc.nextInt();
	        }
	    }

	    return arr;
	}
}
