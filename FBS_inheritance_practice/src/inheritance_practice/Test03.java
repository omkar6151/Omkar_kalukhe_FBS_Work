package inheritance_practice;

class Shape {
	double area;
	
	double calculateArea() {
		return area;
	}
	
	
	void display() {
		System.out.println("Area = "+area);
		
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
	
}

public class Test03 {

	public static void main(String[] args) {
		
		Shape s;
		s = new Triangle(2.5,3.5);
		s.calculateArea();
		s.display();
		System.out.println();
		
		s = new Rectangle(5,8);
		s.calculateArea();
		s.display();
		System.out.println();
		
		s = new Circle(10);
		s.calculateArea();
		s.display();
		//inheritance
//		Triangle t = new Triangle(4.5,6.5);
//		t.calculateArea();
//		t.display();
//		
//		Circle c = new Circle(12);
//		c.calculateArea();
//		c.display();
//		
//		Rectangle r = new Rectangle(6,8);
//		r.calculateArea();
//		r.display();
		

	}

}
