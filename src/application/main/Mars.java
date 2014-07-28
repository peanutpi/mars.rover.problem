package application.main;

public class Mars {
	public static void main(String[] args) {
		// landing
		// landed

		Position position = new Position(3, 3, 'E');
		Command command = new Command("MMRMMRMRRM");
		Rover rover = new Rover(position);
		rover.execute(command);
		rover.printPosition();
	}
}
