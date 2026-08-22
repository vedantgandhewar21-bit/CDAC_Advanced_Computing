import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	System.out.println("Calculator for Addition of  two numbers");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num 1 = ");
	int num1 = sc.nextInt();

	System.out.print("Enter num 2 = ");
	int num2 = sc.nextInt();
	int res = num1+num2;
	System.out.println("Sum of "+num1+" + "+num2+" = "+res);
}
}
