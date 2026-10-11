package Package_03_Loops;

import java.util.Scanner;

public class HW_01printEvenNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<100;i++) {
		if(i%2==0)
		System.out.print(i+" ");
	}
}
}
