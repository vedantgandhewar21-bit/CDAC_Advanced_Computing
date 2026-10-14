package Package_03_Loops;

import java.util.Scanner;

public class HW_18SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		if(num==0) num=1; 
		if(num<0) num=-num;
		int sum=0;
		 while(num!=0) {// //Works with negative no also   

			sum += num % 10;
			num /=10;

		}
		System.out.println("digits are " + sum);
	}
}
