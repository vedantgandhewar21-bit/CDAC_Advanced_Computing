package javaPart1Assignment;

import java.util.Scanner;

public class P034_CheckPrime {
public static void main(String[] args) {
	System.out.println("Check the entered no is prime or not");
	int num = getNumber();
	boolean isPrime=checkPrime(num);
	if(isPrime==true) {
		System.out.println("Is a prime No");
	}
	else {
		System.out.println("Not a prime No");
	}
}
public static int getNumber() {
	int num1;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number  ");
	return sc.nextInt();
}
public static boolean checkPrime(int n1) {
	int i;
	for(i=2;i<=n1/2;i++) {
		if(n1%i==0) {
			System.out.println(i);
			return false;
		}
		
	}
	return true;
}
}
