package javaPart1Assignment;

import java.util.Scanner;

public class P028_MultiplicationTable {
public static void main(String[] args) {
	System.out.println("Print a table for a give number ");
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.print("Enter a number : ");
	num = sc.nextInt();
	printTable(num);
}
public static void printTable(int n1) {
	for (int i = 1;i<=10;i++) {
		System.out.println(n1+" * "+i+" = "+n1*i);
	}
	
}
}
