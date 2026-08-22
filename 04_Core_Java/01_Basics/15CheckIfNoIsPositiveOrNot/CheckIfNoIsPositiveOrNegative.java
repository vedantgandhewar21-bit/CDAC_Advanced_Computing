import java.util.Scanner;
public class CheckIfNoIsPositiveOrNegative {


public static void main(String[] args) {
	System.out.println("Checking No is Postive or Negative : " );
	Scanner sc = new Scanner(System.in);
	int num ;
	System.out.println("Enter a number to check if it  is positive or negative");
	num  = sc.nextInt();
	if(num>=1) 
		System.out.println(num+" is positive no");
	
	else if(num==0)
		System.out.println(num+" Number is Zero");
	else if (num<0)
		System.out.println(num +" Number is negative ");
}}