package Package_02_If_Else;

import java.util.Scanner;

public class Pr_10TernaryOprator {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number: ");
	int num= sc.nextInt();
	System.out.println(num+" is "+((num%2==0)?"Even":"Odd"));
}
}
