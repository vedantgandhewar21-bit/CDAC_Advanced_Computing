import java.util.Scanner;

public class LeapYearOrNot {
public static void main(String[] args) {
	System.out.println("Check if Leap Year Or Not");
	Scanner sc = new Scanner (System.in);
	int year;
	System.out.println("Enter a Year to check");
	year=  sc.nextInt();
	if(year%4==0 && year%100!=0||year%400==0) {
		System.out.println(year+" The Year is a leap year");
	}
	else 
		System.out.println(year +" Not a Leap Year");
	
}
}
