package Package_03_Loops;

import java.util.Scanner;

//Composite Number
public class CW_13BreakStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int x = 0;
		boolean y = false;
		// for (int i=2;i<n-1;i++) {
//		for (int i = 2; i <= n / 2; i++) {
//			if (n % i == 0) {
////			System.out.print(i+" ");
////			System.out.println("Composite Numbere");
//				x = 1;
//				y = true;//boolean
//				break; // without break statement it will print multiple time for different divisor
//			}
//		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				x=1;
				y=true;
				break;
			}
		}
		// 
		if (x == 1) {
			System.out.println("Compoiste Number");
		} else
			System.out.println("Prime Number");
		
       // using Boolean
		if (y) {
			System.out.println("Compoiste Number");
		} else
			System.out.println("Prime Number");
	}
}
