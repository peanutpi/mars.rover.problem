package application.main;

public class Position {

	Location location;
	Direction direction;

	// public Position() {
	// // TODO Auto-generated constructor stub
	// }

	public Position(int i, int j, char c) {
		// TODO Auto-generated constructor stub
		this.location = new Location(i, j);
		this.direction = new Direction(c);
	}

	public Location getLocation() {
		return location;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void turnRight() {
		this.direction.turnRight();
	}

	public void turnLeft() {
		this.direction.turnLeft();
	}

	public void move() {
		this.location.changeLocationAccordingToDirection(this.direction);
	}

	public void print() {
		System.out.println(this.location + " " + this.direction);

	}
}
