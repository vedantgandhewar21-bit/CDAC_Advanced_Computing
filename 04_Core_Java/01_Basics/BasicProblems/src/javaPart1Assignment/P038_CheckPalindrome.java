package javaPart1Assignment;

import java.util.Scanner;

public class P038_CheckPalindrome {
	public static void main(String[] args) {
		System.out.println("Check Palindrome");
		int num = getNumber();
		boolean isPalindrome = checkPalindrome(num);
		if (isPalindrome)
			System.out.println("Is Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :");
		return sc.nextInt();
	}

	public static boolean checkPalindrome(int num) {
		int newNum = num;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
//			rev *= 10;
//			rev += digit;
			rev = rev*10+digit;
			num /= 10;

		}
		if (rev == newNum) {
			return true;
		}

		return false;

	}
}
