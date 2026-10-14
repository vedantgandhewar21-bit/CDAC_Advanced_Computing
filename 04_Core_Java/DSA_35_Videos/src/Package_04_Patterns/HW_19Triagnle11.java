package Package_04_Patterns;

import java.util.Scanner;

public class HW_19Triagnle11 {
	public static void main(String[] args) {
		 /*//take n as input and print
			/*
			 * n=4
	       AAAA
	       BBB
	       CC
	       D
	      */
		 Scanner sc = new Scanner (System.in);
			System.out.print("Enter the value of n:");
			int n = sc.nextInt();
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n+1-i;j++) {
					System.out.print((char)(i+64)+" ");
				}
				System.out.println();
			}
		 
	}
}
