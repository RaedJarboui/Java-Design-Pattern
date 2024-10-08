package com.design.patterns.abstraite.factory.aws;

import com.design.patterns.abstraite.factory.Instance;
import com.design.patterns.abstraite.factory.Instance.Capacity;
import com.design.patterns.abstraite.factory.ResourceFactory;
import com.design.patterns.abstraite.factory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity.micro);
	}

	@Override
	public Storage createStorage(int capacityInMib) {
		return new S3Storage(capacityInMib);
	}

}
