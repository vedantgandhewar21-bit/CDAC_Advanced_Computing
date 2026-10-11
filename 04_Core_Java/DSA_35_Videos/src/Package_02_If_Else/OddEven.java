package Package_02_If_Else;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to check: ");
    int num = sc.nextInt();
    if(num%2==0)
    	System.out.println("The no is even");
    else
    	System.out.println("The no is Odd");
}
}
