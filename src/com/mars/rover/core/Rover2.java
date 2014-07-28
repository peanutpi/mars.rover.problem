package com.mars.rover.core;

public class Rover2 {

	Integer x = 0;
	Integer y = 0;
	Position position;
	Integer facing = LocationConstants.N;

	public Rover() {
	}

	public void printPosition() {
		char dir = 'N';
		if (facing == 1) {
			dir = 'N';
		} else if (facing == 2) {
			dir = 'E';
		} else if (facing == 3) {
			dir = 'S';
		} else if (facing == 4) {
			dir = 'W';
		}
		System.out.println(x + " " + y + " " + dir);
	}

	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}

	private void process(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Speak in Mars language, please!");
		}
	}

	public void move() {

		Integer facing = position.getFacing();
		if (facing == LocationConstants.N) {
			this.y++;
		} else if (facing == LocationConstants.E) {
			this.x++;
		} else if (facing == LocationConstants.S) {
			this.y--;
		} else if (facing == LocationConstants.W) {
			this.x--;
		}
	}

	private void turnLeft() {
		Integer facing = position.getFacing();
		facing = (facing - 1) < LocationConstants.N ? LocationConstants.W
				: facing - 1;
	}

	private void turnRight() {
		Integer facing = position.getFacing();
		facing = (facing + 1) > LocationConstants.W ? LocationConstants.N
				: facing + 1;
	}

	public static void main(String args[]) {
		Rover rover = new Rover();

		Position position = new Position(1, 2, LocationConstants.N);
		rover.setPosition(position);
		rover.process("LMLMLMLMM");
		rover.printPosition(); // prints 1 3 N

		position = new Position(3, 3, LocationConstants.E);
		rover.setPosition(position);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E
	}

	private void setPosition(Position position) {
		this.position = position;
	}
}
