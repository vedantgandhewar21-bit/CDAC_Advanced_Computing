import java.util.Scanner;

public class BitwiseNOT {
	public static void main(String[] args) {
		System.out.println("Bitwise AND");
		Scanner sc = new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Enter Fisrt Number");
		num1 = sc.nextInt();
		res = ~num1;
		System.out.println("num1 is " + num1);//1100
		System.out.println("Result is " + res);//0011
	}
}
