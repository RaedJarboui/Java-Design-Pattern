package com.design.patterns.abstraite.factory;

import com.design.patterns.abstraite.factory.Instance.Capacity;
import com.design.patterns.abstraite.factory.aws.AwsResourceFactory;

public class Client {

	public static void main(String[] args) {
		testAbstractFactory(new AwsResourceFactory(), Capacity.large, 10);

	}

	private static Instance testAbstractFactory(ResourceFactory factory, Capacity capacity, int capacityInMib) {

		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(capacityInMib);
		instance.attachStorage(storage);

		return instance;

	}

}
