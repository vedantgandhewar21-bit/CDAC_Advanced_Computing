package Package_03_Loops;

import java.util.Scanner;

public class HW_21Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a numbwer");
	int n  =sc.nextInt();
	int fac=1;
	while(n>1) {
		fac*=n;
		n--;
	}
	System.out.println(fac);
}
}
