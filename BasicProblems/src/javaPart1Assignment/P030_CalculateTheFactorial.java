package javaPart1Assignment;

import java.util.Scanner;

public class P030_CalculateTheFactorial {
     public static void main(String[] args) {
		System.out.println("Calcualte the Factorial");
		System.out.print("Factorail is :"+CalculateFactorial());
	}
     public static int CalculateFactorial() {
    	 int sum=1,i=1,num;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter a number :");
    	 num = sc.nextInt();
    	 if(num<0) {
    	     sum=0;
    	 }
    	 else {
    	 while(i<=num) {
    		 sum=sum*i;
    		 i++;
    	 
    	 }}
    	 return sum;
    	
     }
}
