package javaPart1Assignment;

import java.util.Scanner;

public class P036_FibonachiSeries {
	public static void main(String[] args) {
		System.out.println("Print Fibonach Series till certian number");
		int num = getNumber();
		fibonachiSeries(num);
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :");
		return sc.nextInt();
	}

	public static void fibonachiSeries(int n1) {

		int a = 0;
		int b = 1;
		if (n1 >= 0)
			System.out.print(a + " ");
		if (n1 >= 1)
			System.out.print(b + " ");
		int c = 0;
		// ----
		while (c < n1) {
			c = a + b;
			if (c < n1)
				System.out.print(c + " ");

			a = b;
			b = c;
			// ----
//		for (int i = 2; c<n1; i++) {
//			 c = a + b;
//			 if(c<n1)
//			System.out.print(c + " ");
//			 
//			a = b;
//			b = c;
		}

	}
}
