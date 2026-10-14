package Package_04_Patterns;

import java.util.Scanner;

public class HW_10Triangle2 {
	public static void main(String[] args) {
		// take n as input and print
			/*
			 * n=5
			 * 1
			 * 12
			 * 123
			 * 1234
			 * 12345
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
