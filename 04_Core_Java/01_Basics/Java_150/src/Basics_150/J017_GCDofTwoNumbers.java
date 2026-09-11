package Basics_150;

import java.util.Scanner;

public class J017_GCDofTwoNumbers {
   public static void main(String[] args) {
	System.out.println("GCD of Two Numbers :");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number :");
	int num1 = sc.nextInt();
	System.out.println("Enter Second Number:");
	int num2 = sc.nextInt();
	
	int gcd = gcd(num1,num2);
	System.out.println("GCD of "+num1+ " & "+num2+" is "+gcd);
	sc.close();
}
   public static int gcd(int a,int b) {
       while(b!=0) {
    	    int temp = b;
    	    b=a%b;
    	    a=temp;
    	   
       }
   return a;
   }
}
