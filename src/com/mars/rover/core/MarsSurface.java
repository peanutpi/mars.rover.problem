package com.mars.rover.core;

public class MarsSurface {

	public MarsSurface(Integer xAxis, Integer yAxis) {
		super();
		if (xAxis <= 0 || yAxis <= 0) {
			throw new IllegalArgumentException(
					"there is no space for rover to move sorry.");
		}

		this.xAxis = xAxis;
		this.yAxis = yAxis;

		Position[][] plataue = new Position[xAxis][yAxis];
	}

	Integer xAxis;
	Integer yAxis;
}
