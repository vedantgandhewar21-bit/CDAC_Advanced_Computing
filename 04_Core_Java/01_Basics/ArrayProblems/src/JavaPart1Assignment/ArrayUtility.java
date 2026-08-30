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
	public static int[][] input2DArray(){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of 2D array enter Rows : ");
		int row = sc.nextInt();
		System.out.print("Enter the Size of 2D array enter Columns : ");
		int col = sc.nextInt();
		int arr2D[][]=new int[row][col];
		int i=0;
		while(i<row) {
			int j=0;
			while(j<col) {
				System.out.print("Enter the element :");
				arr2D[i][j]=sc.nextInt();
				j++;
			}
			i++;
		}
		return arr2D;
		
	}
}
