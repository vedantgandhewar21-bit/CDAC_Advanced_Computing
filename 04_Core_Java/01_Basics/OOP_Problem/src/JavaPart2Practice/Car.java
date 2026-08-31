package JavaPart2Practice;

public class Car {
	//Instance variable
	//properties
int noOfWheels;
String color;
float maxSpeed;
float currentFuelInLiters;
int noOfSeats;

public void drive() {
	System.out.println("Car is driving");
}
public void  addFuel(Float fuel) {
	 currentFuelInLiters +=fuel;
}
public float getCurrentFuelLevel() {
	return currentFuelInLiters;
}
}
