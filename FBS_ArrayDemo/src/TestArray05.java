
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
	int totalGoals;

	FootballPlayer() {
		super();
		this.totalGoals = 20;
	}

	FootballPlayer(int jerseyNo, String name, String sport,int noOfGoals) {
		super(jerseyNo, name, sport);
		this.totalGoals = noOfGoals;
	}

	int getNoOfGoals() {
		return totalGoals;
	}

	void setNoOfGoals(int noOfGoals) {
		this.totalGoals = noOfGoals;
	}
	
	
	void display() {
		super.display();
		System.out.println("No of goals: "+this.totalGoals);
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

class TennisPlayer extends Player {
	int totalPoints;

	TennisPlayer(int jerseyNo, String name, String sport,int noOfPoints) {
		super(jerseyNo,name,sport);
		this.totalPoints = noOfPoints;
	}
	
	TennisPlayer() {
		super();
		this.totalPoints = 1;
	}

	int getNoOfPoints() {
		return totalPoints;
	}

	void setNoOfPoints(int noOfPoints) {
		this.totalPoints = noOfPoints;
	}
	
	void display() {
		super.display();
		System.out.println("Total points: "+this.totalPoints);
	}
}

public class TestArray05 {

	public static void main(String[] args) {
		Player[] arrp = new Player[3];
		arrp[0] = new FootballPlayer(7,"Ronaldo","Football",30);
		arrp[1] = new CricketPlayer(45,"Rohit","Cricket",1000);
		arrp[2] = new TennisPlayer(24,"Djokovic","Tennis",50);
		
		for (int i = 0; i < arrp.length; i++) {
			arrp[i].display();
			System.out.println();
		}

	}

}
