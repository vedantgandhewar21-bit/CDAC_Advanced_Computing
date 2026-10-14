package Package_04_Patterns;

import java.util.Scanner;

public class HW_13Triangle5 {
	public static void main(String[] args) {
		// take n as input and print
			/*
			 * n=5
			 *1
			 *AB
			 *123
			 *ABCD
			 *12345
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			for(int j=1;j<=i;j++) {
				if(i%2==0)
				    System.out.print((char)(j+64)+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
}
