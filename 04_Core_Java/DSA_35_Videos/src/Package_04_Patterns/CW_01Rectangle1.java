package Package_04_Patterns;

import java.util.Scanner;

public class CW_01Rectangle1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter rows and column");
	int row = sc.nextInt();
	int col = sc.nextInt();
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
