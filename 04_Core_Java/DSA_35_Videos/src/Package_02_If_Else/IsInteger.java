package Package_02_If_Else;

import java.util.Scanner;

public class IsInteger {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	double n = sc.nextDouble();
	int x = (int)n;
	if(n-x>0)
		System.out.println("No an integer");
	else
		System.out.println("Is an Integer");
}
}
