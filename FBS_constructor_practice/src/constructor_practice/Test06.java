package constructor_practice;

class Date {
	int date, month, year;

    
    Date() {
        date = 1;
        month = 1;
        year = 2000;
    }

   
    Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void display() {
        System.out.printf("%d / %d / %d", this.date, this.month, this.year);
    }
}

public class Test06 {

	public static void main(String[] args) {
		
		 Date d1 = new Date(30, 4, 2025);
	     d1.display();

	}

}
