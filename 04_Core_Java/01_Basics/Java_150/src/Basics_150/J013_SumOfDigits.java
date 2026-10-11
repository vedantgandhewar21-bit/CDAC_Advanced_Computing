package Basics_150;

import java.util.Scanner;

public class J013_SumOfDigits {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no to add:");
	int num = sc.nextInt();
	int sum=0;
	while(num>0) {
		int temp = num%10;
		sum +=temp;
		num=num/10;
	}
	System.out.println("The sum of all digit is ="+sum);
}
}
