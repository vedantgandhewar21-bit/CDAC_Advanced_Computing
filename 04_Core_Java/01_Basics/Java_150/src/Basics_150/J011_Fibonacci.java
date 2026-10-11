package Basics_150;

import java.util.Scanner;

public class J011_Fibonacci {
public static void main(String[] args) {
 	Scanner sc = new Scanner (System.in);
    System.out.println("Enter no of terms");
    int n= sc.nextInt();

    int a = 0;
    int b = 1;
    
    System.out.println("Fibonacci Series");
    for (int i=1;i<=n;i++) {
    	System.out.println(a +" ");
    	int next = a+b;
    	a=b;
    	b=next;
    	
    }
    sc.close();

}
}
