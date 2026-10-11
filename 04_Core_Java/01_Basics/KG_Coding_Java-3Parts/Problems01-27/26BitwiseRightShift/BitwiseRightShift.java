import java.util.Scanner;

public class BitwiseRightShift {
	public static void main(String[] args) {
		System.out.println("Bitwise AND");
		Scanner sc = new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Enter Fisrt Number");
		num1 = sc.nextInt();
		res = num1>>1;  //right left by 1
		System.out.println("num1 is " + num1);  //0110
		System.out.println("Result is " + res); //0011
	}
}
