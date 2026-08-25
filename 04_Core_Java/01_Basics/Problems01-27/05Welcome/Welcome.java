import java.util.Scanner;
public class Welcome {
	public static void main(String[] args) {
		System.out.print("Enter Your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello "+name+", How are you");
	}
}
