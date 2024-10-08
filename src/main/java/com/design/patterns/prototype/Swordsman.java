package com.design.patterns.prototype;

public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Swordsman(String state) {
		super();
		this.state = state;
	}

	@Override
	public String toString() {
		return "Swordsman " + state + " @ " + getPosition();
	}

	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
