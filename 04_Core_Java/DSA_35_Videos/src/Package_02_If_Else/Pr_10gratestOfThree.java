package Package_02_If_Else;

import java.util.Scanner;

//Gratest of three using ternaryoperator
public class Pr_10gratestOfThree {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  3 numbers to check highest");
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	System.out.println((a>b)?(a>c)?a:c:(b>c)?b:c);
	
	
}
}
