package com.design.patterns.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman s1 = new Swordsman("actif");
		System.out.println(s1);
		GameUnit s2 = testClone(s1);
		System.out.println("s2 :" + s2);

	}

	private static GameUnit testClone(GameUnit game) throws CloneNotSupportedException {
		System.out.println(game.clone());
		return game.clone();

	}

}
