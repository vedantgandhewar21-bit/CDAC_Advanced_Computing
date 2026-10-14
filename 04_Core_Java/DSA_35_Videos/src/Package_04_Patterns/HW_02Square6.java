package Package_04_Patterns;

import java.util.Scanner;

public class HW_02Square6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and column");
		int side = sc.nextInt();
		

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
