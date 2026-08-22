import java.util.Scanner;

public class OddEvenBitwise {
	public static void main(String[] args) {
		System.out.println("Bitwise AND");
		Scanner sc = new Scanner(System.in);
		int num1,  res;
		System.out.println("Enter Number to check Odd or Even");
		num1 = sc.nextInt();
		
		res = num1 & 1;
		
		if (res==1) {
			System.out.println("ENtered Number is Odd");
		}
		else 
			System.out.println("Entered Number is Even ");
	}
}
