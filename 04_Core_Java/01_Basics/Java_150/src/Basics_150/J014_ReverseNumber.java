package Basics_150;

import java.util.Scanner;

public class J014_ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no to add:");
		int num = sc.nextInt();
		int rev=0;
		while(num>0) {
			int temp = num%10;
			rev=rev*10+temp;
			
			num/=10;
		}
		System.out.println("The reversse of given Number is "+rev);
	}
}
