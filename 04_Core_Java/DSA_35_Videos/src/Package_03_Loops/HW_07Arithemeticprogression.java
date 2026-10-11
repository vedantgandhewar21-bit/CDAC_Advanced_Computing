package Package_03_Loops;

import java.util.Scanner;

public class HW_07Arithemeticprogression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		
		/*a=initial value
		 *d=difference 
		 *n=number of times occur
		 *FORMULA
		 * An =a+(n-1)+d 
		     =2+(n-1)*3
		     =2+(3n-3)
		   **=3n-1**
		   ---------
		    //2,5,8,11,14,17		 */
		for(int i=2;i<=(3*n-1);i+=3) {
			System.out.print(i+" ");
		}
	}
}
