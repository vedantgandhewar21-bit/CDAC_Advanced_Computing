package JavaPart1Assignment;

import java.util.Scanner;

public class P041_NumberOfOccurances {
	public static void main(String[] args) {
		System.out.println("Calculate the no of Ocurances");
		int count, num;
		
		//int myArr[]=ArrayUtility.inputArray();//use for taking input in array 
		 int[] myArr = { 12, 23, 2, 1, 23, 2, 1, 2, 3, 3, 12, 12, 23, 12, 2, 32 };
		
		num = getNumber();
		count = countOccurnaces(myArr, num);
		System.out.println("count is :" + count);
	}

	public static int countOccurnaces(int[] arr, int num) {
		int count = 0;
		int index = 0;
		
		System.out.println("inside CountOccurances");
		while (index < arr.length) {
			if( num==arr[index]) {
				count++;
			}
			index++;
		}
		return count;
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to count the occurances :");
		return sc.nextInt();
	}
}
