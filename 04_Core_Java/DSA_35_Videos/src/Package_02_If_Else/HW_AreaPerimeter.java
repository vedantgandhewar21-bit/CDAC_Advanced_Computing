package Package_02_If_Else;

import java.util.Scanner;

//check if area is grater or perimeter is grater of rectangle
public class HW_AreaPerimeter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double breath,length;
	System.out.print("Enter the Breath :");
	breath=sc.nextInt();
	System.out.print("Enter the length :");
	length = sc .nextInt();
	
	double area = breath* length;
	double perimeter =2*(breath+length);
	
	if(area>perimeter)
		System.out.println("Area is grater than perimeter");
	else
		System.out.println("Perimeter is grater than area");
	System.out.println();
}
}
