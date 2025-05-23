package abstractdemo;



abstract class Employee{
	int eid;
	double salary;
	
	
	Employee(){
		
		this.eid = 101;
		this.salary = 12000;
	}
	
	Employee(int eid,double salary){
		
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

	abstract double calculateSal();

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + "]";
	}
	
	
	
}

class SalesManager extends Employee {
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

	@Override
	public String toString() {
		return "SalesManager [desg=" + desg + ", incentive=" + incentive + ", target=" + target + ", totalSalary="
				+ totalSalary + "]";
	}
	
	
}

class HR extends Employee {
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

	@Override
	public String toString() {
		return "HR [commission=" + commission + ", totalSalary=" + totalSalary + "]";
	}
	
	
	
}

class Admin extends Employee {
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

	@Override
	public String toString() {
		return "Admin [allowance=" + allowance + ", totalSalary=" + totalSalary + "]";
	}
	
	
		
}

public class Testemp {

	public static void main(String[] args) {
		Employee e1;
		e1 = new SalesManager(101,5000, "sales manager",1000, 20);
		e1.calculateSal();
		System.out.println(e1);
		System.out.println();
		
		e1 = new HR(201,6000,500);
		e1.calculateSal();
		System.out.println(e1);
		System.out.println();
		
		
		e1 = new Admin(301,8000,500);
		e1.calculateSal();
		System.out.println(e1);
		
		
		
	}
}
