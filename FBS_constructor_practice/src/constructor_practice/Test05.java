package constructor_practice;

class SalesManager {
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	SalesManager(){
		id = 200;
		name = "rohit";
		salary = 3000;
		incentive = 500;
		target = 200;
	}
	
	SalesManager(int id,String name,double salary,double incentive,int target){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}
	
	void display() {
		System.out.println("Sales manager id = " + this.id);
		System.out.println("Sales manager name = " + this.name);
		System.out.println("Sales manager salary = " + this.salary);
		System.out.println("Sales manager incentive = " + this.incentive);
		System.out.println("Sales manager target = " + this.target);

	}
}


public class Test05 {

	public static void main(String[] args) {
		SalesManager sm = new SalesManager(15,"hardik",5000,3000,12);
		sm.display();

	}

}
