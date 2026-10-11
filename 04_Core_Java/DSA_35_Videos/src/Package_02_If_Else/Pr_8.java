package Package_02_If_Else;

import java.util.Scanner;

//If Else Ladder
public class Pr_8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check its divibility ");
	int num=sc.nextInt();
	if(num%5==0 && num%3==0)
		System.out.println("Number is divisble by both 5 & 3");
	else if(num%5==0)
		System.out.println("Number is divisble by 5");
	else if(num%3==0)
		System.out.println("Number is divisible by 3");
	else 
		System.out.println("Number is not divisble by 5 and 3");
}
}
