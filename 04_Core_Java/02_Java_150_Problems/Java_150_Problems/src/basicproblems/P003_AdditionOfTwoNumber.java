package basicproblems;

import java.util.Scanner;

public class P003_AdditionOfTwoNumber {
public static void main(String[] args) {
	System.out.println("Enter a Two no to add Number :");
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	System.out.println("Sum of two number is :"+(num1+num2));
	
}
}
