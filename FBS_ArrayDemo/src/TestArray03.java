

class Employee1{
	int eid;
	double salary;
	
	
	Employee1(){
		
		this.eid = 101;
		this.salary = 12000;
	}
	
	Employee1(int eid,double salary){
		
		this.eid = eid;
		this.salary = salary;
	}

	int getEid() {
		return eid;
	}

	void setEid(int eid) {
		this.eid = eid;
	}


	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	double calculateSal() {
		return salary;
	}
	
	void display() {
		
		
		System.out.println("employee id = "+this.eid);
		System.out.println("employee salary = "+this.salary);
		
	}
}

class SalesManager extends Employee1 {
	String desg;
	double incentive;
	double target;
	double totalSalary;
	
	
	SalesManager() {
		super();
		this.desg = "not given";
		this.incentive = 500;
		this.target = 10000;
	}	
	
	SalesManager(int eid, double salary,String desg, double incentive, double target) {
		super(eid,salary);
		this.desg = desg;
		this.incentive = incentive;
		this.target = target;
		
	}

	String getDesg() {
		return desg;
	}

	void setDesg(String desg) {
		this.desg = desg;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	double calculateSal() {
		this.totalSalary = getSalary() + getIncentive();
		return totalSalary;
	}
	
	
	
	void display() {
		super.display();
		System.out.println("designation: "+this.desg);
		System.out.println("Sales manager incentive: "+this.incentive);
		System.out.println("Sales manager target: "+this.target);
		System.out.println("total salary: "+this.totalSalary);
		System.out.println();
	}
	
	
}

class HR extends Employee1 {
	double commission;
	double totalSalary;
	
	HR() {
		super();
		this.commission = 200;
	}
	
	HR(int eid,double salary,double commission){
		super(eid,salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	double calculateSal() {
		this.totalSalary = getSalary() + getCommission();
		return totalSalary;
		
	}
	
	
	
	void display() {
		super.display();
		System.out.println("HR commission: "+this.commission);
		System.out.println("total salary: "+this.totalSalary);
	}
	
}

class Admin extends Employee1 {
	double allowance;
	double totalSalary;
	
	Admin() {
		super();
		this.allowance = 200;
	}

	Admin(int eid,double salary,double allowance) {
		super(eid,salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	double calculateSal() {
		this.totalSalary = getSalary() + getAllowance();
		return totalSalary;
	}
	
	void display() {
		super.display();
		System.out.println("Admin allowance: " +this.allowance);
		System.out.println("Admin total salary: "+this.totalSalary);
	}
		
}

public class TestArray03 {

	public static void main(String[] args) {
		
		Employee1[] arrEmp = new Employee1[3];
		
		arrEmp[0] = new SalesManager(101,20000,"sales manager",1000,20);
		arrEmp[1] = new HR(201,30000,5000);
		arrEmp[2] = new Admin(301,40000,3000);
		
		for (int i = 0; i < arrEmp.length; i++) {
			arrEmp[i].calculateSal();
			arrEmp[i].display();
			System.out.println();
		}
				
	}
}
