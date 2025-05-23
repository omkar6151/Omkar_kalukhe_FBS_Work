
class Employee
{
	int id;
	String name;
	double sal;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSal() {
		return sal;
	}
	void setSal(double sal) {
		this.sal = sal;
	}
	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	Employee() {
		this.id = 10;
		this.name = "not given";
		this.sal = 20;
	
	}
	
	void display() {
		System.out.println("Employee id=" + id + ", "
				+ "\n name=" + name + ", "
						+ "\nsal=" + sal);
		
	}
	
}
class TestArray {
	public static void main(String[] args) {
		Employee[] arrEmp;//reference of array
		arrEmp= new Employee[3];//array of references created 
		arrEmp[0]= new Employee(101,"Sachin",30000);
		arrEmp[1]= new Employee(102,"Virat",40000);
		arrEmp[2]= new Employee(103,"Rohit",50000);
		
	}
	public static void main1(String[] args) {

		int[] arr= {10,20,30,40,50};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	

}
