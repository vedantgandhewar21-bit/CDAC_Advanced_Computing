import java.util.Scanner;
/*
 * age less than 5 then 75 % discount
   age grater than 60 then 25 % discount
   if idFemale then 50 % discount */
public class LogicalOperator {
public static void main(String[] args) {
	System.out.println("Discount offer on Bus fare :");
	int age;
	Scanner sc =new Scanner (System.in);
	
	System.out.println("Enter your age to get the disount: ");
	age = sc.nextInt();
	boolean isFemale ;
	System.out.println("Enter you are Female ? true /false");
	isFemale = sc.nextBoolean();
	
	if(age<5) {
		System.out.println("you got 75% discount");
	}
	else if(isFemale) {
		System.out.println("you got 50% discount");
	}
	else if(age>60) {
		System.out.println("You got 25% discount");
	}
	else {
		System.out.println("You got no discount");
	}
}
}
