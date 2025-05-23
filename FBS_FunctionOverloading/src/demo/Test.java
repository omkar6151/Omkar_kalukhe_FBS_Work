package demo;

class Calculator{
	
	int add(int a, int b) {
		int c = a+b;
		return c;
		
	}
	void add(double d1,double d2) {
		double d3 = d1+d2;
		System.out.println("sum = "+ d3);
	}
	
	void add(int x, double y) {
		System.out.println("sum=" + (x+y));
	}
}

public class Test {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();
		
//		System.out.println("sum=" +c1.add(3, 5));
//		c2.add(3.2, 5.7);
//		c3.add(6, 1.4);
		
		int i1=4, i2=7;
		System.out.println("sum= " +c1.add(i1, i2));
		
		double d1=2.4, d2=4.5;
		c2.add(d1, d2);
		
		int i3=4;
		double d3 = 2.5;
		c3.add(i3, d3);

	}

}
