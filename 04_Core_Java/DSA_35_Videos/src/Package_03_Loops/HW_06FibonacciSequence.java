package Package_03_Loops;

import java.util.Scanner;

public class HW_06FibonacciSequence {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int n=sc.nextInt();
    int a=0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    for (int i=2;i<(3*n-1);i++) {
    	int temp=0;
    	temp=a+b;
    	a=b;
    	b=temp;
    	System.out.println(temp);
    }
}
}
