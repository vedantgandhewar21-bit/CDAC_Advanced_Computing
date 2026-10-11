import java.util.Scanner;

public class CalculateGrade {
public static void main(String[] args) {
	System.out.println("Calculate Grade");
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter Percentage :");
	float per = sc.nextFloat();
	if(per<=100) {
	if(per>=90) {
		System.out.println("You got A Grade");
	}
	else if(per>=75){
		System.out.println("You got B Grade");
	}
	else if(per>=60){
		System.out.println("You got C Grade");
	}
	else if(per>=30){
		System.out.println("You got D Grade");
	}
	else if(per<30){
		System.out.println("You got F Grade");
	}
	}
	else {
		System.out.println("Invalid Input");
	}
}
}
