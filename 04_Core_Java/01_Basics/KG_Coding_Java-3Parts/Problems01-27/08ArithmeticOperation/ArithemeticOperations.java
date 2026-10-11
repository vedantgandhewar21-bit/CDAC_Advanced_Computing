import java.util.Scanner;

public class ArithemeticOperations {
public static void main(String[] args) {
	//Create a program that takes two no as an input and perform 4 arithmetic operation on the,
	System.out.println("$ Arithematic Operations");
	Scanner sc = new Scanner (System.in);
	int num1, num2;
	System.out.print("Enter two numbers : ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();

	System.out.println("Addition");
	int sum = num1 + num2;
	System.out.println("Additon of two no is "+sum);
	
	System.out.println("\nSubtration");
	int sub = num1 - num2;
	System.out.println("Subtraction of two no is "+sub);
	
	System.out.println("\nMultiplication");
	int mul = num1 * num2;
	System.out.println("Multiplication  of two no is "+mul);
	
	System.out.println("\nDivision");
	int div = num1 / num2;
	System.out.println("Division of two no is "+div);
	
}
}
