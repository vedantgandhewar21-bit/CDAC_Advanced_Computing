package Package_02_If_Else;

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
	    int num = sc.nextInt();
//	    if(num>0)
//	    	System.out.println(num);
//	    else
//	    	System.out.println(-num);
	    
	    if(num<0) num=-num;
	    
	    System.out.println(num);
}
}