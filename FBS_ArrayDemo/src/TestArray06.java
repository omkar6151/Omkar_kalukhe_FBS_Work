

class ElectronicDevice {
	 int id;
	 String type;
	 String brand;
	 double price;
	 
	 ElectronicDevice() {
			
			this.id = 100;
			this.type = "not given";
			this.brand = "not given";
			this.price = 111;
		}
	 
	ElectronicDevice(int id, String name,String brand, double price) {
		
		this.id = id;
		this.type = name;
		this.brand = brand;
		this.price = price;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}
	

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	 
	void display() {
		System.out.println("Device id: "+this.id);
		System.out.println("Device type: "+this.type);
		System.out.println("Device brand: "+this.brand);
		System.out.println("Device price: "+this.price);
	}
 }
 
 class Mobile extends ElectronicDevice {
	 int totalRAM;
	 int noOfCamera;
	  
	 
	Mobile() {
		super();
		this.totalRAM = 6;
		this.noOfCamera = 2;
	}


	Mobile(int id,String type,String brand,double price,int totalRAM, int noOfCamera) {
		super(id,type,brand,price);
		this.totalRAM = totalRAM;
		this.noOfCamera = noOfCamera;
	}


	int getTotalRAM() {
		return totalRAM;
	}


	void setTotalRAM(int totalRAM) {
		this.totalRAM = totalRAM;
	}


	int getNoOfCamera() {
		return noOfCamera;
	}


	void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	
	
	void display() {
		super.display();
		System.out.println("Total RAM space of mobile: "+this.totalRAM);
		System.out.println("No of cameras in mobile: "+this.noOfCamera);
	}
	 
 }
 
 class TV extends ElectronicDevice {
	 int screenSize;
	 String resolution;
	 
	TV() {
		super();
		this.screenSize = 150;
		this.resolution = "not given";
	}
	TV(int id, String name, String brand, double price, int screenSize, String resolution) {
		super(id, name, brand, price);
		this.screenSize = screenSize;
		this.resolution = resolution;
	}
	int getScreenSize() {
		return screenSize;
	}
	void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	String getResolution() {
		return resolution;
	}
	void setResolution(String resolution) {
		this.resolution = resolution;
	}
	 
	 void display() {
		 System.out.println("\n");
		 super.display();
		 System.out.println("TV scrren size: "+this.screenSize);
		 System.out.println("TV resolution: "+this.resolution);
		 
	 }
 }
 
 class MusicSystem extends ElectronicDevice {
	 int totalBase;
	 int noOfSpeaker;
	 
		MusicSystem() {
			super();
			this.totalBase = 1;
			this.noOfSpeaker = 1;
		}
	 
	MusicSystem(int id, String type,String brand,double price,int totalBase, int noOfSpeaker) {
		super(id,type,brand,price);
		this.totalBase = totalBase;
		this.noOfSpeaker = noOfSpeaker;
	}

	int getTotalBase() {
		return totalBase;
	}

	void setTotalBase(int totalBase) {
		this.totalBase = totalBase;
	}

	int getNoOfSpeaker() {
		return noOfSpeaker;
	}

	void setNoOfSpeaker(int noOfSpeaker) {
		this.noOfSpeaker = noOfSpeaker;
	}
	 
	void display() {
		System.out.println("\n");
		super.display();
		System.out.println("total base in music system: "+this.totalBase);
		System.out.println("no of speakers in music system: "+this.noOfSpeaker);
	}
	 
 }

public class TestArray06 {

	public static void main(String[] args) {
		
		ElectronicDevice[] arrEd = new ElectronicDevice[3];
		arrEd[0] = new Mobile(101,"Mobile","Samsung",10000,6,3);
		arrEd[1] = new MusicSystem(201,"Music system","Boat",5000,100,4);
		arrEd[2] = new TV(301,"Television","Sony",40000,150,"4K");
		
		for (int i = 0; i < arrEd.length; i++) {
			arrEd[i].display();
			System.out.println();
		}
	}

}

