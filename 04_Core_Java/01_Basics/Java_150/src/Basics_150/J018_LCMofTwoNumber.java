package Basics_150;

import java.util.Scanner;

public class J018_LCMofTwoNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter First No :");
	int num1 = sc.nextInt();
	System.out.print("Enter Second No:");
	int num2 = sc.nextInt();
	int gcd = gcd(num1,num2);
	int lcm = (num1/gcd)*num2;
	System.out.println("LCM of "+num1+" & "+num2 +" is " +lcm);
}
public static int gcd(int x,int y) {
	while(y!=0) {
		int temp = y;
		y = x%y;
		x= temp;
	}
	return x;
}
}
