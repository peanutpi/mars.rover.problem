package application.main;

public class Location {

	Integer x;
	Integer y;

	public Location(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void changeLocationAccordingToDirection(Direction direction) {
		Integer facing = direction.getFacing();
		if (facing == 0) {
			y++;
		} else if (facing == 1) {
			x++;
		} else if (facing == 2) {
			y--;
		} else if (facing == 3) {
			x--;
		}

		System.out.println(toString());
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

}
