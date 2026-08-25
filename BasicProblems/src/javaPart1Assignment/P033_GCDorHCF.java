package javaPart1Assignment;

import java.util.Scanner;

public class P033_GCDorHCF {
	public static void main(String[] args) {
		System.out.println("GCD or HCF");
		int num1, num2;
		num1 = getNumber();
		num2 = getNumber();
		int gcd = calculateGCD(num1, num2);
		System.out.println("GCD is = " + gcd);

	}

	public static int calculateGCD(int n1, int n2) {
		int small;
		if (n1 < n2)
			small = n1;
		else
			small = n2;
		int i = small; //for better understanding assigning small to i
		while (true) {
			
			if (n1 % i == 0 && n2 % i == 0) {
				return i;
			}
			i--;
		}
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		return sc.nextInt();
	}
}
