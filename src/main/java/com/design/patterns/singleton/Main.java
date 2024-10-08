package com.design.patterns.singleton;

public class Main {

	public static void main(String[] args) {
		// cant create instance with new operator
		/* EagerRegistry eager1 = new EagerRegistry() */

		EagerRegistry eager1 = EagerRegistry.getInstance();
		EagerRegistry eager2 = EagerRegistry.getInstance();
		System.out.println(eager1 == eager2); // true

		LazyRegistryWithDCL lazy1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazy1 == lazy2); // true

	}

}
