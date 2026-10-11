package javaPart1Assignment;

import java.util.Scanner;

public class P035_ReverseTheDigit {
	public static void main(String[] args) {
		System.out.println("Reverse the Digit");
		int num = getNumber();
	   int reverse =reverseDigit(num);
	   System.out.println("before :"+num);
	   System.out.println("After  :"+reverse);
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :");
		return sc.nextInt();
	}
	public static int reverseDigit(int num) { 
		int newNum =0;
		while (num!=0) {
			int digit=num%10;
			newNum = newNum *10;
			newNum += digit; 
			num /= 10;
			
		}
		return newNum;
	}
}
