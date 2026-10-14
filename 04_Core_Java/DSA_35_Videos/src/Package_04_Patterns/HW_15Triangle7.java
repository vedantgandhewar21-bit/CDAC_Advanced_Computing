package Package_04_Patterns;

import java.util.Scanner;
//take n as input and print
			/*
			 * n=4
			abcd
			abc
			ab
			a
			 */
public class HW_15Triangle7 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int n = sc.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print((char)(j+96)+" ");
		}
		System.out.println();
	}
	
}
}
