package inheritance_practice;

class Player {
	int jerseyNo;
	String name;
	String sport;
	
	
	Player() {
		this.jerseyNo = 100;
		this.name = "not given";
		this.sport = "not given";
	}

	Player(int jerseyNo, String name, String sport) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.sport = sport;
	}

	int getJerseyNo() {
		return jerseyNo;
	}

	void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSport() {
		return sport;
	}

	void setSport(String sport) {
		this.sport = sport;
	}
	
	void display() {
		System.out.println("Player Jersey no: "+this.jerseyNo);
		System.out.println("Player name: "+this.name);
		System.out.println("Sport name: "+this.sport);
	}
	
}//class player ends here

class FootballPlayer extends Player {
	int noOfGoals;

	FootballPlayer() {
		super();
		this.noOfGoals = 20;
	}

	FootballPlayer(int jerseyNo, String name, String sport,int noOfGoals) {
		super(jerseyNo, name, sport);
		this.noOfGoals = noOfGoals;
	}

	int getNoOfGoals() {
		return noOfGoals;
	}

	void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}
	
	
	void display() {
		super.display();
		System.out.println("No of goals: "+this.noOfGoals);
	}
	
	
}

class CricketPlayer extends Player{
	int totalRuns;
	
	CricketPlayer() {
		super();
		this.totalRuns = 100;
	}

	CricketPlayer(int jerseyNo, String name, String sport,int totalRuns) {
		super(jerseyNo,name,sport);
		this.totalRuns = totalRuns;
	}

	int getTotalRuns() {
		return totalRuns;
	}

	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	
	void display() {
		super.display();
		System.out.println("Total runs: "+this.totalRuns);
	}
	
}

public class Test04 {

	public static void main(String[] args) {
		Player p1;  //generic reference
		p1 = new FootballPlayer(5,"messi","football",30);
		p1.display();
		System.out.println();
		
//		CricketPlayer cp = new CricketPlayer(10,"Sachin Tendulkar","Cricket", 1000);
//		cp.display();
		
		p1 = new CricketPlayer(10,"sachin","cricket",1000);
		p1.display();

	}

}
