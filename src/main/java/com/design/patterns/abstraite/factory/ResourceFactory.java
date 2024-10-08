package com.design.patterns.abstraite.factory;

import com.design.patterns.abstraite.factory.Instance.Capacity;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

	public Instance createInstance(Capacity capacity);

	public Storage createStorage(int capacityInMib);

}
