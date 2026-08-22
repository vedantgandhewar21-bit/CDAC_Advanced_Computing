import java.util.Scanner;

public class AreaOfTriangle {
public static void main(String[] args) {
	System.out.println("Area of Triangle");
	Scanner sc = new Scanner(System.in);
	float height,base,Area ;
	System.out.print("Enter the  heigh of traingle :");
	height = sc.nextFloat();
	System.out.print("Enter the  base of traingle :");
	base = sc.nextFloat();
	//Area = 0.5*base*height; error
	Area = (base*height)/2;
	System.out.println("Area of traingle : "+Area+" unit2");
}
}
