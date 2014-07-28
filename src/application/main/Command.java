package application.main;


public class Command {

	char[] commands;

	public Command(String commands) {
		super();
		this.commands = commands.toCharArray();
	}

	public void execute(Rover rover) {
		for (char command : commands) {
			if (command == 'L') {
				rover.turnLeft();
			} else if (command == 'R') {
				rover.turnRight();
			} else if (command == 'M') {
				rover.move();
			}
		}
	}

}
