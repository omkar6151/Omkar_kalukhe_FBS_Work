package inheritance_practice;

class Student{
	int fbid;
	String name;
	int distance;
	
	
	Student() {
		
		System.out.println("student default constructor called");
		this.fbid = 101;
		this.name = "not given";
		this.distance = 80;
	}
	
	
	Student(int fbid, String name, int distance) {
		super();
		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
	}


	int getFbid() {
		return fbid;
	}
	void setFbid(int fbid) {
		this.fbid = fbid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	
	void display() {
		System.out.println("Id is: " +fbid);
		System.out.println("Name is: "+name);
		System.out.println("Distance is: "+distance);
	}
	
	
}//class Student ends here

class PlacedStudent extends Student{
	String company;
	String desg;
	
	PlacedStudent() {
//		System.out.println("placed student default constructor called");
//		this.fbid = 101;
//		this.name = "not given";
//		this.distance = 50;
		
		super();
		this.company = "not assigned";
		this.desg = "xyz";
	}
	
	PlacedStudent(int fbid,String name,int distance,String company, String desg) {
//		this.fbid = fbid;
//		this.name = name;
//		this.distance = distance;
	
		super(fbid,name,distance);
		this.company = company;
		this.desg = desg;
	}//par constructor ends here
	
	
	
	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getDesg() {
		return desg;
	}

	void setDesg(String desg) {
		this.desg = desg;
	}

	void display() {
//		System.out.println("Id is: " +fbid);
//		System.out.println("Name is: "+name);
//		System.out.println("Distance is: "+distance);
		
		super.display();
		System.out.println("Company is: "+this.company);
		System.out.println("Designation is: "+this.desg);
	}
	
}//class placed student ends here

public class Test01 {

	public static void main(String[] args) {
		
		PlacedStudent ps1 = new PlacedStudent();
		ps1.setFbid(18);
		ps1.setName("virat");
		ps1.setDistance(800);
		ps1.setCompany("RCB");
		ps1.setDesg("opener");
		ps1.display();
		

	}

}
