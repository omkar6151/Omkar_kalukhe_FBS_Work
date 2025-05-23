package constructor_practice;

class Employee {
	int id;
	String name;
	double salary;
	
	Employee() {  //default constructor
		this.id = 1;
		this.name = "not given";
		this.salary = 1000;
	}
	
	public Employee(int i, String nm, double s) {  //parameterized constructor
		this.id = i;
		this.name = nm;
		this.salary = s;
	}
	
	
	
	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("employee id = " + this.id);
		System.out.println("employee name = " + this.name);
		System.out.println("employee salary = " + this.salary);
	}
}

public class Test02 {

	public static void main(String[] args) {
		Employee t1 = new Employee();
		Employee t2 = new Employee();
		t2.id = 2;
		t2.name = "akshay";
		t2.salary = 2000;
		t1.display();
		
		System.out.println("\n");
		
		t2.display();
		
		
		
		
		

	}

}
