package Demo;

public class Main {

	public static void main(String[] args) {
		
		Assignment01 a1 = new Assignment01();
		float res = a1.Temperature(10);
		System.out.println("Temperature = " + res);
		
		Assignment01 a2 = new Assignment01();
		float result1 = a2.area(5, 10);
		float result2 = a2.perimeter(5, 10);
		System.out.println("Area = " + result1);
		System.out.println("Perimeter = "+ result2);
		
		Assignment01 a3 = new Assignment01();
		int num = a3.totalSum(123);
		System.out.println("Total sum of number = " + num);
		
		Assignment01 a4 = new Assignment01();
		a4.evenOdd(12);
		
		Assignment01 a5 = new Assignment01();
		a5.totalSalary(8000);
		
		Assignment01 a6 = new Assignment01();
		a6.marriage(22, 20);

	}

}
