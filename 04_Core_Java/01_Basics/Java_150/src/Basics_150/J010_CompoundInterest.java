package Basics_150;

import java.util.Scanner;

public class J010_CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount ");
		double p = sc.nextDouble();
		System.out.print("Enter Rate of Interest ");
		double r = sc.nextDouble();
		System.out.print("Enter Time in years ");
		double t = sc.nextDouble();
		double total = p * Math.pow((1 + r / 100), t);
		double ci = total - p;
		System.out.println("Compound Interest " + ci);
		System.out.println("Total Amount " + total);
		sc.close();
	}

}
