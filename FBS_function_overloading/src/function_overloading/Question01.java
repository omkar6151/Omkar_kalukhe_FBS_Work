package function_overloading;

class Calculator {
	
	void calculate(int a, int b) {
		int add = a + b;
		
		System.out.println("Addition = " + add);
		
	}
	void calculate(float a, float b) {
		float sub = a - b;
		
		System.out.println("Subtraction = " + sub);
		
	}
	void calculate(int a, float b) {
		
		double mul = a * b;
	
		
		System.out.println("Multiplication = " + mul);
		
	}
	void calculate(double a, double b) {
		
		double div = a / b;
	
		
		System.out.println("Division = " + div);
		
	}
	
}

public class Question01 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();	
		c1.calculate(10, 5);
		Calculator c2 = new Calculator();
		c2.calculate(10.5f, 5.5f);
		Calculator c3 = new Calculator();
		c3.calculate(20, 4.5);
		Calculator c4 = new Calculator();
		c4.calculate(155, 55);
		
		
		
	}

}
