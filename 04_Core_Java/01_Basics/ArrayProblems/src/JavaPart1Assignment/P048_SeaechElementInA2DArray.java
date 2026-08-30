package JavaPart1Assignment;

import java.util.Scanner;

public class P048_SeaechElementInA2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2D Array Input Method");
		int[][] my2DArr = ArrayUtility.input2DArray();
		System.out.print("Enter a number to find :");
		int num = sc.nextInt();
		if (SerchElementIn2DArray(my2DArr, num)) {
			System.out.println("Element Found in Array");
		} else {
			System.out.println("Element Not Found In Array");
		}

	}

	public static boolean SerchElementIn2DArray(int[][] arr2D, int num) {
		int i = 0 ;
		while (i < arr2D.length) {
			int j = 0;
			while (j < arr2D[i].length) {
				if (arr2D[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;

	}

}
