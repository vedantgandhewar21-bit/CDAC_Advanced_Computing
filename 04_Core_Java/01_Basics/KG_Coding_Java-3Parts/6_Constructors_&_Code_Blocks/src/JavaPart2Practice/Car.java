package JavaPart2Practice;

public class Car {
	String color;
	float price;
	int noOfWheels;
	float maxSpeed;
	float currentFuelInLiters;
	int noOfSeats;
	

	Car(){ // Default Constructor
		color = "Black";
	    price = 5000;
	}
	public static void main(String[] args) {
		Car swift = new Car();
	}
}
