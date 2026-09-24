package Basics_150;

import java.util.Scanner;

public class J009_SimpleInterest {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Principal Amount ");
	double p = sc . nextDouble();
	System.out.print("Enter Rate of Interest ");
    double r = sc.nextDouble();
    System.out.print("Enter Time in years ");
    double t = sc.nextDouble();
    double SI = (p*r*t)/100;
    System.out.println("Simple Interest = "+SI);
    sc.close();
    
  
  
  
  }
}
