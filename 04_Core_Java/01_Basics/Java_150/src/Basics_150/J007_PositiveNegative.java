package Basics_150;

import java.util.Scanner;

public class J007_PositiveNegative {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	
	if(n>=0) {
		System.out.println("No is Positive");
	}
	else {
		System.out.println("No is Negative");
	}
	
	
}
}
