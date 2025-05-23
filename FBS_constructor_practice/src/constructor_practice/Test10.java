package constructor_practice;

class Product{
	int id,quantity;
	String name;
	double price;
	
	Product(){
		id = 101;
		name = "Shirts";
		quantity = 2;
		price = 599;
	}
	
	Product(int id, String name, int quantity, double price){
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	void display() {
		System.out.println("Product id = "+ this.id);
		System.out.println("Product name = "+ this.name);
		System.out.println("Product quantity = "+ this.quantity);
		System.out.println("Product price = "+ this.price);
	}
}

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(202,"Pants",3,799);
		p1.display();
	}

}
