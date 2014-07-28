package application.main;

public class Direction {

	final Integer N = 0;
	final Integer E = 1;
	final Integer S = 2;
	final Integer W = 3;
	Integer currentDirection = N;

	public Direction(char dir) {
		switch (dir) {
		case 'N':
			this.currentDirection = N;
			break;
		case 'E':
			this.currentDirection = E;
			break;
		case 'S':
			this.currentDirection = S;
			break;
		case 'W':
			this.currentDirection = W;
			break;
		}

	}

	public Integer getFacing() {
		return currentDirection;
	}

	public void turnRight() {
		this.currentDirection = (currentDirection == W) ? N
				: this.currentDirection + 1;
	}

	public void turnLeft() {
		this.currentDirection = (currentDirection == N) ? W
				: this.currentDirection - 1;
	}

	@Override
	public String toString() {
		switch (currentDirection) {
		case 0:
			return "N";
		case 1:
			return "E";
		case 2:
			return "S";
		case 3:
			return "W";
		default:
			return "no direction";
		}
	}
}
