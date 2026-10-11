package Package_03_Loops;

import java.util.Scanner;

//1,2,4,8,16,32,.....
public class CW_10GP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int a = 1;
        int r = 2;
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			a *= r;
		}
	}
}
