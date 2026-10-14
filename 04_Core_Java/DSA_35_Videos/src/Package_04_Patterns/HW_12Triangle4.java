package Package_04_Patterns;

import java.util.Scanner;

public class HW_12Triangle4 {
	public static void main(String[] args) {
		// take n as input and print
			/*
			 * n=5
			 *A
			 *BB
			 *CCC
			 *DDDD
			 *EEEEE
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
}
