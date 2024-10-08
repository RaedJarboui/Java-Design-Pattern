package com.design.patterns.prototype;

public abstract class GameUnit implements Cloneable {

	private Point3D position;

	public GameUnit() {
		position = Point3D.ZERO;
	}

	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}

	public Point3D getPosition() {
		return position;
	}

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		return (GameUnit) super.clone();
	}
}
