package constructor_practice;

class Distance{
	int feet, inch;
	
	Distance(){
		feet = 12;
		inch = 3;
	}
	
	Distance(int feet, int inch){
		this.feet = feet;
		this.inch = inch;
	}
	
	void display() {
		System.out.println("distance in feet = " + this.feet + " feet");
		System.out.println("distance in inch = " + this.inch + " inch");
	}
}

public class Test08 {

	public static void main(String[] args) {
		Distance d1 = new Distance(15,5);
		d1.display();

	}

}
