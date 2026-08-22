import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	System.out.println("Fahrenhei to Celsius");
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the temperature in Fahrenheit to get the temprature in celsius :");
	float F;
	 F = sc.nextFloat();
	
	//float C = (F-32)*(5.0f/9.0f); can also be used
	 
	 float C = (F-32)*5/9;
	System.out.println("The temperature is = "+C+" Celsius ");
	
}
}
