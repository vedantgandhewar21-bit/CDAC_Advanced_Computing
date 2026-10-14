package Package_04_Patterns;

import java.util.Scanner;

public class HW_08Square8 {
	// take n as input and print
	/*
	 * n=4 
	 * aaaa 
	 * BBBB 
	 * cccc 
	 * DDDD
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			
			 {
				for (int j = 1; j <= n; j++) {
					if (i % 2 == 0)
					    System.out.print((char)(i + 64) + " ");
					else
						System.out.print((char)(i + 96) + " ");
				}
				System.out.println();
			}
			
		}
	}
}
