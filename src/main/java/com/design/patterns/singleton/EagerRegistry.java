package com.design.patterns.singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

	// prevent creation another instance of this classe outside of this class
	private EagerRegistry() {

	}

	private static final EagerRegistry Instance = new EagerRegistry();

	public static EagerRegistry getInstance() {
		return Instance;
	}

}
