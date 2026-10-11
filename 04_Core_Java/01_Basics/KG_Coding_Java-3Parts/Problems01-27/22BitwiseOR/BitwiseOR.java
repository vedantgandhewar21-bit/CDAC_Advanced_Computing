import java.util.Scanner;

public class BitwiseOR {
	public static void main(String[] args) {
		System.out.println("Bitwise AND");
		Scanner sc = new Scanner(System.in);
		int num1,num2,res;
		System.out.println("Enter Fisrt Number"); //1100
		num1= sc.nextInt();
		System.out.println("Enter second Number");//0011
		num2 = sc.nextInt();
		res = num1 | num2;
		                                      // --------
		System.out.println("Result is "+ res);    //1111
	}
}
