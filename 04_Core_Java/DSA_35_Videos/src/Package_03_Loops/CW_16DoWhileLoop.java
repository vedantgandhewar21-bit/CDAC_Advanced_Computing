package Package_03_Loops;

import java.util.Scanner;

public class CW_16DoWhileLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int i=sc.nextInt();
	do {
		System.out.print(i);
		i++;
	}while(i>5&& i<=10);
}
}
