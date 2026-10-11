package Basics_150;

import java.util.Scanner;

public class J015_ArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int temp=num,sum=0,digits=0;
		int original = num;
		while(num>0) {
			temp/=10;
			digits++;
		}
		temp = num;
		while(temp>0) {
			int digit =temp%10;
			
		}
		
	}
}