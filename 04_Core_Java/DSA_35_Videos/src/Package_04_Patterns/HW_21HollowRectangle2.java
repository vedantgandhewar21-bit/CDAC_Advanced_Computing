package Package_04_Patterns;

import java.util.Scanner;

public class HW_21HollowRectangle2 {
	/*
Enter the value of row and col=:4:5

* * * * * 
*       * 
*       * 
* * * * * 
* */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of row and col:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 1; j <= col; j++) 
			{
				if (i == 1 || j == 1 || i == row || j == col) 
				{
					System.out.print("* ");
				} else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
