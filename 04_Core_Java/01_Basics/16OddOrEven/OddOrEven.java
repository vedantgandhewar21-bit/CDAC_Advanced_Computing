import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		System.out.println("checking if  no is Odd Or Even ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to :");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" Is a EVEN Number");
		}
		else
			System.out.println(num+" Is a ODD Number");
			
				
	}
}
