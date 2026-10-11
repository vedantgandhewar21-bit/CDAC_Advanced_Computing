package Package_02_If_Else;

import java.util.Scanner;
//Sides of Triangle
public class Pr_7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	System.out.println("Enter side 1");
	a=sc.nextInt();
	
	System.out.println("Enter side 2");
	b=sc.nextInt();
	
	System.out.println("Enter side 3");
	c=sc.nextInt();
	
	if(a+b>c && b+c>a && c+a>b)
		System.out.println("It is a triangle");
	else
		System.out.println("It is not a triangle");
}
}
