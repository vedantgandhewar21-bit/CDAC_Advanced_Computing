package javaPart1Assignment;

import java.util.Scanner;

public class P029_SumOfAllOddNo {

public static void main(String[] args) {
	System.out.println("ssum off all od numbers");
	
	System.out.println("Sum of all odd no till given no :"+SumofAllOddNo());
}
public static int SumofAllOddNo() {
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.print("Enter a number :");
	num = sc.nextInt();
	int sum=0,i=1;
	while(i<=num) {
		sum+=i;
		i=i+2;
		
	}
	return sum;
}
}