package Package_03_Loops;

import java.util.Scanner;

public class CW_12AsciiValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i=65;i<=90;i++) {
		System.out.print((char)i);
		System.out.println(" "+i);
		
	}
	System.out.println("\n");
	for(int i=97;i<=122;i++) {
		System.out.print((char)i);
		System.out.println(" "+i);
		
	}
}
}
