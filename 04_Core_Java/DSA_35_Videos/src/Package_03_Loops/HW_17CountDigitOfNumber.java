package Package_03_Loops;

import java.util.Scanner;

public class HW_17CountDigitOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		if(num==0) num=1; //1 or any no so 0 is also counted as one digit when 0 is entered  
		int count = 0;
		 while(num!=0) {// //Works with negative no also   

			num = num / 10;
			count++;

		}
		System.out.println("digits are " + count);
	}
}
