package inheritance_practice;

class Vehicle {
	String brand; 
	String type;
	
	
	Vehicle() {
		this.brand = "maruti";
		this.type = "bus";
	}

	Vehicle(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	
	void brake() {
		System.out.println("not given");
	}
	
	void display() {
		System.out.println("Vehicle brand: "+this.brand);
		System.out.println("Vehicle type: "+this.type);
	}
	
}

class Bike extends Vehicle {
	int noOfGear;
	int fuelCapacity;
	
	Bike() {
		super();
		this.noOfGear = 1;
		this.fuelCapacity = 1;
	}
	
	
	Bike(String brand, String type, int noOfGear, int fuelCapacity) {
		super(brand,type);
		this.noOfGear = noOfGear;
		this.fuelCapacity = fuelCapacity;
		
	}


	int getNoOfGear() {
		return noOfGear;
	}


	void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}


	int getFuelCapacity() {
		return fuelCapacity;
	}


	void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	void brake(){
	System.out.println("Disc brake");	
	}
	
	void display() {
		super.display();
		System.out.println("No of gears in bike: "+this.noOfGear);
		System.out.println("Total fuel capacity: "+this.fuelCapacity);
	}
	
}

class Car extends Vehicle {
	String fuelType;
	String carType;
	
	Car() {
		super();
		this.fuelType = "not given";
		this.carType = "not given";
	}
	Car(String brand, String type, String fuelType, String carType) {
		super(brand, type);
		this.fuelType = fuelType;
		this.carType = carType;
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	String getCarType() {
		return carType;
	}
	void setCarType(String carType) {
		this.carType = carType;
	}
	
	void brake() {
		System.out.println("Air brake");
	}
	
	void display() {
		System.out.println("\n");
		super.display();
		System.out.println("fuel type of car: "+this.fuelType);
		System.out.println("car type: "+this.carType);
	}
}

class Bus extends Vehicle{
	int seatCapacity;

	Bus() {
		super();
		this.seatCapacity = 10;
	}
	
	
	Bus(String brand, String type,int seatCapacity) {
		super(brand,type);
		this.seatCapacity = seatCapacity;
	}


	int getSeatCapacity() {
		return seatCapacity;
	}


	void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	void brake() {
		System.out.println("hudraulic brake");
	}
	
	void display() {
		System.out.println("\n");
		super.display();
		System.out.println("seat capacity of bus: "+this.seatCapacity);
	}
	 
	
}

public class Test06 {

	public static void main(String[] args) {
		Vehicle v;
		v = new Bike("Yamaha","bike",6,20);
		v.display();
		v.brake();
		System.out.println();
		
		v = new Car("Honda","car","diesel","sedan");
		v.display();
		v.brake();
		System.out.println();
		
		v = new Bus("Tata","bus",50);
		v.display();
		v.brake();
		
		//inheritance part
//		Bike b = new Bike("Honda","bike",6,5);
//		b.display();
//		
//		Car c = new Car("Hyundai","car","diesel","SUV");
//		c.display();
//		
//		Bus b1 = new Bus("Tata","bus",50);
//		b1.display();
	}

}
