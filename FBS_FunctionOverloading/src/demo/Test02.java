package demo;

class Printer {
	void print(String a) {
		System.out.println(a);
	}
	void print(int a) {
		System.out.println(a);
	}
	void print(double a) {
		System.out.println(a);
	}
	void print(char a) {
		System.out.println(a);
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer();
		p1.print("abc");
		Printer p2 = new Printer();
		p2.print(10);
		Printer p3 = new Printer();
		p3.print(2.5);
		Printer p4 = new Printer();
		p4.print('A');
		
		

	}

}
