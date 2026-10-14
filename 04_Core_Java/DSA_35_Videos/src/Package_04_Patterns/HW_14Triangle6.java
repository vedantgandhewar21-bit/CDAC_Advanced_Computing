package Package_04_Patterns;

import java.util.Scanner;

public class HW_14Triangle6 {
	public static void main(String[] args) {
		// take n as input and print
			/*
			 * n=4
			 * * * * * 
               * * * 
               * * 
               * 
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
