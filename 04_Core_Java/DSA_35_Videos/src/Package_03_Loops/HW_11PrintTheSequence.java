package Package_03_Loops;

import java.util.Scanner;

public class HW_11PrintTheSequence {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int n = sc.nextInt();
	/*take n as input and 
	 * Print this series
	 * 1
	 * n
	 * 2
	 * n-1
	 * 3
	 * n-2
	 * */
	System.out.println(1);
	System.out.println(n);
	for(int i=2;i<=n;i++) {
		System.out.println(i);
		System.out.println(n-(i-1));
	}
}
}
