package Basics_150;

import java.util.Scanner;

public class J008_LeapYear {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a year :");
        int year = sc.nextInt();
	    
        if(year%400 ==0) {
        	System.out.println(year+" Year is a Leap Year");
        }
        else if(year%100==0) {
        	System.out.println(year+" Year s not a Leap Year");
        }
        else if(year%4==0) {
        	System.out.println(year+" Year is a Leap Year");
        }
        else {
        	 System.out.println(year+" is not a leap year");
        }
        sc.close();
    }
}
