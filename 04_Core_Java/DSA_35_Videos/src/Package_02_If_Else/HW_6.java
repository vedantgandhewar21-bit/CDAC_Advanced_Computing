package Package_02_If_Else;

import java.util.Scanner;

//Check Whether Magnitude Is Smaller Than 69
public class HW_6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();
	if(num<0) num=-num;
	if(num<69) 
		System.out.println("Magnitude is smaller than 69");
	else
		System.out.println("Magnitude is not smaller than 69");
}
}
