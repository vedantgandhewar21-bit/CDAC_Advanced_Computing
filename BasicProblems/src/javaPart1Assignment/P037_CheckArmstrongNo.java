package javaPart1Assignment;

import java.util.Scanner;

public class P037_CheckArmstrongNo {

	public static void main(String[] args) {
		System.out.println("Check Armstrong No");
		int num = getNumber();
		boolean isArmstrongNo = isArmstrongNo(num);
		if (isArmstrongNo)
			System.out.println("Is Armstrong no");
		else
			System.out.println("Not a Armstrong No");
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :");
		return sc.nextInt();
	}

	public static boolean isArmstrongNo(int n1) {
		int ArmstNo = 0;
		int temp = n1;
		while (n1 != 0) {
			int digit = n1 % 10;
			ArmstNo += digit * digit * digit;
			n1 = n1/10;

		}
		if (ArmstNo == temp) {
			return true;
		}

		return false;

	}
}
