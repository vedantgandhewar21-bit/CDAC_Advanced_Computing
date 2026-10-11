package Package_02_If_Else;

import java.util.Scanner;

public class HW_X_Y_Point {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y;
	System.out.print("Enter the value of X :");
	x = sc.nextInt();
	
	System.out.print("Enter the value of Y :");
	y = sc.nextInt();
	
	if(x==0 && y==0)
		System.out.println("Origin");
	else if(y==0 && x!=0)
		System.out.println("x-Axis");
	else if(x==0 && y!=0)
		System.out.println("y-Axis");
	else if(x>0 && y>0)
		System.out.println("1st Quadrant");
	else if(x<0 && y>0)
		System.out.println("2nd Quadrant");
	else if(x<0 && y<0)
		System.out.println("3rd Quadrant");
	else if(x>0 && y<0)
		System.out.println("4th Quadrant");
	
}
}
