package JavaPart2Practice;

public class Driver {
	String name="vedant";
	String dateOfLicense;
	int age;
	static int minAgeForDriving = 18;

	public boolean isAllowedToDive() {
		return this.age >= minAgeForDriving;
	}
	public static void main(String[] args) {

		{
//Car myCar = new Car();
// myCar.drive();
// int fuel= (int) myCar.getCurrentFuelLevel();
			// System.out.println("Avalable Fuel in Liters = "+fuel);

// System.out.println("Avalable Fuel in Liters = "+myCar.currentFuelInLiters);
// myCar.addFuel(6.0f);
// myCar.drive();
// myCar.drive();
// myCar.drive();
// myCar.drive();
// myCar.drive(); 
// myCar.drive();

// Car swift = new Car();
// swift.addFuel(6f);
// swift.start();
// swift.start();
// swift.start();
// swift.start();
// swift.start();
// swift.start();
// swift.start();
		}
//		Car maruti = new Car();
//
//		Car startedCar = maruti.start();
//		maruti.drive();
//		maruti.addFuel(5f);
//// startedCar.drive();
//		maruti.start().drive();

		Driver myDriver = new Driver();
		myDriver.dateOfLicense = "1/09/2026";
        //Driver.name = "Rahul";  // Error
		//myDriver.name = "Rajesh";
		System.out.println(" -"+minAgeForDriving);
		//System.out.println( " -"+name );// Error , chnage Name to Static
		System.out.println( " -"+myDriver.name );
		
		
		
		
		/*
		 * Sure 👍 Here are the 7 use cases in very short points:
		 * 
		 * Static Variable: Belongs to the class. One shared copy for all objects.
		 * 
		 * Non-static Variable: Belongs to the object. Each object has its own copy.
		 * 
		 * Static Method: Belongs to the class. Can be called without creating an
		 * object.
		 * 
		 * Non-static Method: Belongs to the object. Requires an object to call it.
		 * 
		 * Static → Non-static: Static method cannot directly access non-static members.
		 * Can access them through an object reference.
		 * 
		 * Non-static → Static: Non-static method can directly access static members.
		 * Because static members belong to the class and are shared.
		 * 
		 * this with Static: Non-static method → has this. Static method → does not have
		 * this because it has no current object.
		 */
	}
	
}