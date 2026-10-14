package Package_03_Loops;

import java.util.Scanner;

public class HW_22APowerB {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a :");
	int a = sc.nextInt();
	System.out.print("Enter Power :");
	int b = sc.nextInt();
	int t=1;
	for(int i=1;i<=b;i++) {
		t*=a;
	}
	System.out.println(t);
}
}
