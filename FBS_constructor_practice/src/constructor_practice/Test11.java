package constructor_practice;

class Info{
	int id;
	String name;
	int age;
	
	void display() {
		System.out.println("id = " +this.id);
	}
}

public class Test11 {

	public static void main(String[] args) {
		Info i = new Info();
		i.id = 12;
		
		i.display();

	}

}
