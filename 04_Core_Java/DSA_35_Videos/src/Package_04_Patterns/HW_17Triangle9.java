package Package_04_Patterns;

import java.util.Scanner;

public class HW_17Triangle9 {
 public static void main(String[] args) {
	 /*//take n as input and print
		/*
		 * n=4
        1234
        123
        12
        1
      */
	 Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n+1-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	 
}
}
