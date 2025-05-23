package constructor_practice;

class Time{
int hour, min, sec;
	
	Time() {
		hour = 10;
		min = 45;
		sec= 8;
	}
	
	Time(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void display() {
		System.out.printf("Time is %d hrs, %d minutes, %d seconds",this.hour,this.min,this.sec);
	}
}

public class Test07 {

	public static void main(String[] args) {
		Time t1 = new Time(12,34,3);
		t1.display();

	}

}
