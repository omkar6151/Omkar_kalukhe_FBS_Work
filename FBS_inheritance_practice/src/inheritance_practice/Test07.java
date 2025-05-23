package inheritance_practice;

class DefenceDepartment {
	String name;
	int totalHeadquarter;
	
DefenceDepartment() {
		
		this.name = "not given";
		this.totalHeadquarter = 1;
	}
	
	
	DefenceDepartment(String name, int totalHeadquarter) {
		
		this.name = name;
		this.totalHeadquarter = totalHeadquarter;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	int getTotalHeadquarter() {
		return totalHeadquarter;
	}


	void setTotalHeadquarter(int totalHeadquarter) {
		this.totalHeadquarter = totalHeadquarter;
	}
	
	void motto() {
		System.out.println("this is motto");
	}
	
	void display() {
		System.out.println("Defence department name: "+this.name);
		System.out.println("No of headquarters: "+this.totalHeadquarter);
	}
}

class Army extends DefenceDepartment{
	double totalBatallion;
	
	Army() {
		super();
		this.totalBatallion = 1;
	}

	Army(String name,int totalHeadquarter,double totalBatallion) {
		super(name,totalHeadquarter);
		this.totalBatallion = totalBatallion;
	}

	double getTotalBatallion() {
		return totalBatallion;
	}

	void setTotalBatallion(double totalBatallion) {
		this.totalBatallion = totalBatallion;
	}
	
	void motto() {
		System.out.println("Service before self.");
	}
	
	void display() {
		super.display();
		System.out.println("Total no of batallions: "+this.totalBatallion);
	}
	
}

class Navy extends DefenceDepartment {
	double totalShips;
	
	Navy() {
		super();
		this.totalShips = 1;
	}
	

	Navy(String name,int totalHeadquarter,double totalShips) {
		super(name,totalHeadquarter);
		this.totalShips = totalShips;
	}


	double getTotalShips() {
		return totalShips;
	}


	void setTotalShips(double totalShips) {
		this.totalShips = totalShips;
	}
	
	void motto() {
		System.out.println("Sham No Varunam");
	}
	void display() {
		super.display();
		System.out.println("Total no of ships: "+this.totalShips);
	}
	
	
}

class Airforce extends DefenceDepartment {
	double totalJets;
	
	Airforce() {
		super();
		this.totalJets = 1;
	}

	Airforce(String name,int totalHeadquarter,double totalJets) {
		super(name,totalHeadquarter);
		this.totalJets = totalJets;
	}

	double getTotalJets() {
		return totalJets;
	}

	void setTotalJets(double totalJets) {
		this.totalJets = totalJets;
	}
	
	void motto() {
		System.out.println("Nabaha Sparsham Deeptam");
	}
	
	void display() {
		super.display();
		System.out.println("Total no of jets: "+this.totalJets);
	}
	
}

public class Test07 {

	public static void main(String[] args) {
		DefenceDepartment d;
		d = new Army("Indian Army",10,200);
		d.display();
		d.motto();
		System.out.println();
		
		d = new Navy("Indian Navy",12,300);
		d.display();
		d.motto();
		System.out.println();
		
		d = new Airforce("Indian Airforce",14,400);
		d.display();
		d.motto(); 

	}

}
