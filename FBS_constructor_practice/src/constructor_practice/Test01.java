package constructor_practice;

class Student {
	int rollNo;
	String name;
	int marks;
	
	Student() {
		rollNo = 11;
		name = "Nikhil";
		marks = 20;
	}
	
	Student(int rollNo, String name, int marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Student roll = " + this.rollNo);
		System.out.println("Student name = " + this.name);
		System.out.println("Student marks = " + this.marks);
	}
}


public class Test01 {

	public static void main(String[] args) {
		Student s1 = new Student(20,"Rahul",40);
		s1.display();
		System.out.println("\n");
		Student s2 = new Student();
		s2.display();

	}

}
