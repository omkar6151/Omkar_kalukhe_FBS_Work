package constructor_practice;

class Complex{
	int real, imaginary;
	
	Complex(){
		real = 234;
		imaginary = -2;
	}
	
	Complex(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void display() {
		System.out.println("real no = "+ this.real);
		System.out.println("imaginary no = "+ this.imaginary);
	}
}


public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(123,-1);
		c1.display();

	}

}
