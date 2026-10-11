import java.util.Scanner;

public class CompoudInterest {

public static void main(String[] args) {
	System.out.println("Compound Interest");
	Scanner input = new Scanner(System.in);
	int Principal,Tenuer;
	
	System.out.print("Enter the --Princippal-- Amount for simple Interest : ");
	Principal = input.nextInt();
	
	System.out.print("Enter the --Tenuer-- for how long you want to keep the money :");
	Tenuer= input.nextInt();
	
	System.out.print("Enter the --Interest-- percentage thet you are expecting :");
	float Interest = input.nextFloat();
	
	double Total = Principal*Math.pow((1+Interest/100), Tenuer);
	System.out.println("The Total will be  will be  :"+Total);
	System.out.println("The Compund interest amount will be = "+(Total-Principal));
	
}
}
