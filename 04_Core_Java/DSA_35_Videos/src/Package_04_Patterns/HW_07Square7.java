package Package_04_Patterns;

import java.util.Scanner;

public class HW_07Square7 {
	//take n as input and print 
			/*
			 * n=4 
			 * AAAA
			 * BBBB
			 * CCCC
			 * DDDD
			 */

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number :");
				int n = sc.nextInt();
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						System.out.print((char)(i+64)+ " ");
					}
					System.out.println();
				}
			}
}
