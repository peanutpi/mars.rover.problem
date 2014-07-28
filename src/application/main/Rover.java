package application.main;

public class Rover {

	Position position;

	public Rover(Position position) {
		this.position = position;
	}

	public void execute(Command command) {
		command.execute(this);
	}

	public void turnLeft() {
		this.position.turnLeft();
	}

	public void turnRight() {
		this.position.turnRight();
	}

	public void move() {
		this.position.move();
	}

	public void printPosition() {
		this.position.print();
	}

}
