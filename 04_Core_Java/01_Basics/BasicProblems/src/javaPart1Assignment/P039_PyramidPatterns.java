package javaPart1Assignment;

public class P039_PyramidPatterns {
	public static void main(String[] args) {
		System.out.println("Pyramid Patterns");
	    //LeftHalfPyramid();
		System.out.println();
		//reverseLeftHalfPyramid();
		System.out.println();
		RightHalfPyramid();

	}

	public static void LeftHalfPyramid() {
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void reverseLeftHalfPyramid() {
		/*
		 * *****
		 * **** 
		 * *** 
		 * ** 
		 * *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void RightHalfPyramid() {
		/*
		 *      * 
		 *     ** 
		 *    *** 
		 *   **** 
		 *  *****
		 */
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
}
