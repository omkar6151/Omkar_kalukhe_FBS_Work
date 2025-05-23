package constructor_practice;

class Admin {
	int id;
	String name;
	double salary;
	double allowance;
	
	Admin(){
		id = 100;
		name = "abcd";
		salary = 1000;
		allowance = 5000;
	}
	
	Admin(int id,String name,double salary,double allowance){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}
	
	void display() {
		System.out.println("Admin id = " + this.id);
		System.out.println("Admin name = " + this.name);
		System.out.println("Admin salary = " + this.salary);
		System.out.println("Admin allowance = " + this.allowance);

}
}

public class Test03 {

	public static void main(String[] args) {
		Admin a1 = new Admin(150,"pqrs",2000,1000);
		a1.display();

	}
}

