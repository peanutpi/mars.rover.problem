package com.mars.rover.core;

/**
 * @author Pratik
 * 
 */
public class Position {

	public Position(Integer x, Integer y, Integer facing) {
		super();
		this.x = x;
		this.y = y;
		this.facing = facing;
	}

	Integer x;
	Integer y;
	Integer facing;

	public Integer getFacing() {
		return facing;
	}

	// public void setPosition(Integer x, Integer y, Integer facing) {
	// this.x = x;
	// this.y = y;
	// this.facing = facing;
	// }

}
