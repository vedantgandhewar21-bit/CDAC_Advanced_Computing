import java.util.Scanner;

public class PerimeterOfRectangle {
public static void main(String[] args) {
	System.out.println("Perimeter of Rectangle Enter 4 Sides : ");
	Scanner sc = new Scanner(System.in);
	int A,B,C,D;
	A=sc.nextInt();
	B=sc.nextInt();
	C=sc.nextInt();
	D=sc.nextInt();
	
	int perimeter = A+B+C+D;
	 
	System.out.println("Perimeter of Rectangle  is :"+perimeter);
	
}
}
