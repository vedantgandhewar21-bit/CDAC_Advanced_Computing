import java.util.Scanner;

public class ProduuctOfTwoFloatingPointNo {
             public static void main(String[] args) {
				System.out.println("Enter two floating point no : ");
				Scanner sc = new Scanner(System.in);
				float num1 = sc.nextFloat();
				float num2 = sc.nextFloat();
				
				float res = num1+num2;
				System.out.println("Sum of two floating point number is "+res);
			}
}
