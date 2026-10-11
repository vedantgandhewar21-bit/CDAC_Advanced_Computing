package JavaPart1Assignment;

import java.util.Scanner;

public class P046_CheckPalindrome {
	public static void main(String[] args) {
		System.out.println("Chec Pllindrome ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Element :");
		int size = sc.nextInt();
		int []myArr = new int[size];
		int i=0;
		while(i<myArr.length) {
			System.out.print("Enter the Element in Array: ");
			myArr[i]=sc.nextInt();
			i++;
		}
		if(checkPalindrome(myArr)) {
			System.out.println("Array is a Palindrome");
		}
		else {
			System.out.println("Array is Not a Palindrome");
		}
	}

	public static boolean checkPalindrome(int[] arr) {
		// int[] revArr=new int[arr.length-1];
		int i = 0;
		int temp;
		while (i < arr.length / 2) {
			if (arr[i] != arr[(arr.length - 1) - i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
