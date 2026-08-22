import java.util.Scanner;


public class SimpleInterest {
public static void main(String[] args) {
	System.out.println("Simple Interest ");
	Scanner input = new Scanner(System.in);
	int Principal,Tenuer,Interest;
	
	System.out.print("Enter the --Princippal-- Amount for simple Interest : ");
	Principal = input.nextInt();
	
	System.out.print("Enter the --Tenuer-- for how long you want to keep the money :");
	Tenuer= input.nextInt();
	
	System.out.print("Enter the --Interest-- percentage thet you are expecting :");
	Interest = input.nextInt();
	
	float Simple_Interest = (float)(Principal*Tenuer*Interest)/100;
	System.out.println("The Simple Interest will be  will be  :"+Simple_Interest);
	System.out.println("The total amount will be = "+(Simple_Interest+Principal));
}
}
