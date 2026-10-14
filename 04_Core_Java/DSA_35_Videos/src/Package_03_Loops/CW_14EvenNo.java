package Package_03_Loops;

import java.util.Scanner;

public class CW_14EvenNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter:");
	int n = sc.nextInt();
	
//	for (int i=1;i<=Math.sqrt(n);i++) {
//		if(n%i==0) {
//			System.out.println("Even No "+i);
//			if(i!=n/i)
//			System.out.println("Factors "+n/i);
//		}
//	}
	for (int i=1;i<=n;i++) {
		if(n%i!=0) 
			continue;
		System.out.println(i);
		
	}
}
}
