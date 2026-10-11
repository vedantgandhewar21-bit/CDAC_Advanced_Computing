package Package_03_Loops;

import java.util.Scanner;

public class HW_08Ari {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		
		/* An =a+(n-1)*d 
			     =2+(n-1)*3
			     =2+(3n-3)
			   **=3n-1* 
		      =4+(n-1)+6
		      =4+(6n-6)
		      6n-2	*/	  
		//4,10,16,22
		for(int i=4;i<=(6*n-2);i+=6) {
			System.out.println(i);
		}
	}
	
}
