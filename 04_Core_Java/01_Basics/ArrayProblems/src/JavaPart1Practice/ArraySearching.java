package JavaPart1Practice;

import java.util.Scanner;

public class ArraySearching {
	public static void main(String[] args) {
		System.out.println("Serching a Number i Array");
		int[] myArr = { 1, 2, 4, 46, 7, 43, 236, 87, 534, 3, 25, 46, 84, 424, 5 };
		int num = getNumber();
		if (searchNumber(myArr, num)) {
			System.out.println("Number Found in Aray");
		} else {
			System.out.println("Number Not Found In Array");
		}
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number :");
		return sc.nextInt();
	}

	public static boolean searchNumber(int[] arr, int n1) {
		int index = 0;
		while (index < arr.length) {
			if (arr[index] == n1) {
				return true;
			}
			index++;
		}
		return false;

	}
	
}
