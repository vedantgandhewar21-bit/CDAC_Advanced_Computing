package JavaPart2Practice;

public class Car {
	// Instance variable
	// properties
	int noOfWheels; // 0 By Default values
	String color; // NUll
	float maxSpeed; // 0
	float currentFuelInLiters;// 0
	int noOfSeats;// 0
    float price;
	

		Car() { // Default Constructor
			color = "Black";
			price = 50000;
		}

	
//Start the car
	public Car start() {

		if (currentFuelInLiters <= 0) {
			System.out.println("Car is out of fule Caar cannot Start,Add Fuel  ");

		} else if (currentFuelInLiters < 5) {
			System.out.println("Car is in reserve mode, Please Refuel");
		} else {
			System.out.println("Car is Started bruhh---- else block");

		}
		return this;
	}
//Drive the car

	public void drive() { // simple way
		if (currentFuelInLiters <= 0) {
			System.out.println("Drive Block No Fuel, Add Fuel");
		} else if (currentFuelInLiters < 5) {
			System.out.println("Car is in reserve mode, Please Refuel");
			currentFuelInLiters--;
		} else {
			System.out.println("Car is driving");
			currentFuelInLiters--;
		}

	}

	public void addFuel(Float currentFuelInLiters) { 
		this.currentFuelInLiters += currentFuelInLiters;
		System.err.println(currentFuelInLiters + " Added in the Car");
	}

	public float getCurrentFuelLevel() {
		return currentFuelInLiters;
	}
}
