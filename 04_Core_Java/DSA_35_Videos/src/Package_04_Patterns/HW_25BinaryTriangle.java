package Package_04_Patterns;

import java.util.Scanner;

public class HW_25BinaryTriangle {
	/*
Enter the value of n:5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");

		int n = sc.nextInt();
		// 1st Method using extra variable
		/*{
			int a = 1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(a);
					if (a == 0)
						a = 1;
					else
						a = 0;
				}
				System.out.println();

			}
		}*/
	
	   //Second method
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				if((i+j)%2==0) { // check even
					System.out.print(1+" ");
				}
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
}
