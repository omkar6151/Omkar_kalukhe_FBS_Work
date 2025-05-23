

class Shape {
	double area;
	
	double calculateArea() {
		return area;
	}
	
	
	void display() {
		System.out.println("Given shape and its area...");
		
	}
			
	}		
	
	
	class Triangle extends Shape{
	double base;
	double height;
	
	Triangle() {
		super();
		this.base = 1;
		this.height = 1;
	}

	
	Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	double calculateArea() {
		this.area = 0.5 * getBase() * getHeight();
		return area;
	}
	
	void display() {
		super.display();
		System.out.println("Area of triangle: "+this.area);
	}
	
}

class Circle extends Shape {
	double radius;

	Circle() {
		this.radius = 3.5;
	}

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double calculateArea() {
		this.area = 3.14 * getRadius() * getRadius();
		return area;
	}
	
	void display() {
		super.display();
		System.out.println("Area of Circle: "+this.area);
	}
	
	
}

class Rectangle extends Shape {
	double length;
	double breadth;
	
	Rectangle() {
		this.length = 2.2;
		this.breadth = 3.3;
	} 

	Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	double calculateArea() {
		this.area = getLength() * getBreadth();
		return area;
	}
	
	void display() {
		super.display();
		System.out.println("Area of Rectangle: "+this.area);
	}
	
}

public class TestArray04 {

	public static void main(String[] args) {
		Shape[] arr = new Shape[3];
		arr[0] = new Triangle(4.5,5.5);
		arr[1] = new Rectangle(5,10);
		arr[2] = new Circle(8);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].calculateArea();
			arr[i].display();
			System.out.println();
		}

		

	}

}
