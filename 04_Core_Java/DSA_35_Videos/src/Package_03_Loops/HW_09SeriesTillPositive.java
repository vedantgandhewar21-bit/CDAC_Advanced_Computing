package Package_03_Loops;

import java.util.Scanner;
//Series till all positive
//99,95,91,87 upto all terms are positive
public class HW_09SeriesTillPositive {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number:");
	int n=sc.nextInt();
	//using i>=0 condition
//	for (int i=99;i>=0;i-=4) {
//		System.out.print(i+" ");
//	}
	//using aritmetic progression
	/* An =a+(n-1)*d 
			     =2+(n-1)*3
			     =2+(3n-3)
          =99-(n+1)*(-4)		
          =99-4n+4
          ==103-4n	 
			  */
	for(int i=99;(i>=103-4*n && i>0);i-=4) {
		System.out.print(i+" ");
	}
}
}
