package javaPart1Practice;

import java.util.Scanner;

public class Return {
public static void main(String[] args) {
	System.out.println("Method calling");
	int num1 =getNumber();
	System.out.println("The number is :"+num1);
}
public static int getNumber() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Inside Method");
	System.out.print("Enter a number :");
	return sc.nextInt();
}
}
