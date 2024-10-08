package com.design.patterns.abstraite.factory.gcp;

import com.design.patterns.abstraite.factory.Instance;
import com.design.patterns.abstraite.factory.Instance.Capacity;
import com.design.patterns.abstraite.factory.ResourceFactory;
import com.design.patterns.abstraite.factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capacityInMib) {
		return new GoogleCloudStorage(capacityInMib);
	}

}
