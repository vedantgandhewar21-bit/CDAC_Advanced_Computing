package javaPart1Assignment;

import java.util.Scanner;

public class P031_SumOffAllDigitOfInteger {
public static void main(String[] args) {
	//int num1 = getNumber();
	System.out.println("Sum Of all digit :"+SumOfAllDigit(getNumber()));
}
  public static int SumOfAllDigit(int n1) {
	  int sum=0;
	 
	  while(n1!=0) {
		  sum += n1%10;
		  n1/=10;

	  }
	  return sum;
}
  
  public static int getNumber() {
	  greet();
	  Scanner sc = new Scanner (System.in);
	  System.out.print("Enter a Number :");
      return sc.nextInt();
  }
  
  public static void greet() {
	  System.out.println("welcome");
  }
}