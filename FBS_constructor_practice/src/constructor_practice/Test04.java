package constructor_practice;

class HR {
	int id;
	String name;
	double salary;
	double commission;
	
	HR(){
		id = 11;
		name = "omkar";
		salary = 2000;
		commission = 500;
	}
	
	HR(int id, String name, double salary,double commission){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}
	
	void display() {
		System.out.println("HR id = " +this.id);
		System.out.println("HR name = " +this.name);
		System.out.println("HR salary = " +this.salary);
		System.out.println("HR commission = " +this.commission);

	}
}

public class Test04 {

	public static void main(String[] args) {
		HR h = new HR(101, "mahesh",3000,400);
		h.display();

	}

}
