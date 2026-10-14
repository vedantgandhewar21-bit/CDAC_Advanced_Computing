package Package_04_Patterns;

import java.util.Scanner;

public class HW_20HollowRectangle {
	public static void main(String[] args) {
/* 
* * * * * * * * 
* *           *    for getting the diagonal we have condition 
*   *         *    if(i==j)
*     *       *    thats why we are getting the diagonal
*       *     * 
*         *   * 
*           * *    
* * * * * * * * 
* */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of row and col:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j == i || i == row || j == col || i == 1 || j == 1/*||(i+j)==row*/) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
}