package javaPart1Practice;

import java.util.Scanner;

public class Parameter {
public static void main(String[] args) {
	System.out.println("Adding two numbers uing Method calling");
	
	int num1,num2;
	num1=getNumber();
	num2=getNumber();
	
//	int res = sumTwoNumbers(num1,num2);  // correct 
//	System.out.println("Sum of Two Number is "+res);
	
	System.out.println("Sum of Two Number is "+sumTwoNumbers(num1,num2)); //
}
public static int  getNumber() {
	System.out.print("Enter a number :");
	Scanner sc = new Scanner(System.in);
	return sc.nextInt();
}
public static int sumTwoNumbers(int n1, int n2) {
	return n1+n2;
}
}
