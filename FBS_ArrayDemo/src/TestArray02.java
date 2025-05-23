
class Date {
	int day;
	int month;
	int year;
	String dow;
	
	Date(int day, int month, int year, String dow) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
	}
	
	Date() {
		this.day = 10;
		this.month = 7;
		this.year = 2002;
		this.dow = "Wednesday";
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getDow() {
		return dow;
	}

	void setDow(String dow) {
		this.dow = dow;
	}
	
	void display() {
		System.out.println("Day: "+this.day+
				"\nmonth: "+this.month+ "\nyear: "
				+this.year+
				"\ndow: "+this.dow );
	}
	
	
}
public class TestArray02 {

	public static void main(String[] args) {
		Date[] arrd;
		arrd = new Date[4];
		arrd[0] = new Date(15,3,1968,"Tuesday");
		arrd[1] = new Date(24,7,1975,"Thursday");
		arrd[2] = new Date(4,11,1995,"Friday");
		arrd[3] = new Date(26,4,2024,"Sunday");
		
		for (int i = 0; i < arrd.length; i++) {
			arrd[i].display();
			System.out.println();
		}
	}

}
