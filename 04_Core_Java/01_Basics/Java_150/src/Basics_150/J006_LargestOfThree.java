package Basics_150;

import java.util.Scanner;

public class J006_LargestOfThree {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter first No :");
	int num1 = sc.nextInt();
	System.out.print("Enter Second No :");
	int num2 = sc.nextInt();
	System.out.print("Enter Third No :");
	int num3 = sc.nextInt();
	
	if(num1>num2) {
		if(num1>num3) {
			System.out.println(num1+" is largest");
		}
	}else if(num2>num3) {
		System.out.println(num2+" is largest");
	}
	else {
		System.out.println(num3+" is largest");
	}
	
}
}
