package Package_02_If_Else;

import java.util.Scanner;

public class Pr_6 {
public static void main(String[] args) {
	System.out.println("Enter a number ");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	if(num%5==0||num%3==0) {
		System.out.println("Divisible by 5 or 3");
	}
	else
		System.out.println("Not Divisible by 5 or 3");
}
}
