package com.design.patterns.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

	private LinkedList<T> linkedList;

	public Queue(LinkedList<T> list) {
		this.linkedList = list;
	}

	@Override
	public void offer(T element) {
		linkedList.addFirst(element);

	}

	@Override
	public T poll() {
		return linkedList.removeFirst();
	}

}
