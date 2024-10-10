package com.design.patterns.bridge;

public class Main {

	public static void main(String[] args) {

		FifoCollection fifo = new Queue<>(new ArrayLinkedList<>());
		fifo.offer(10);
		System.out.println(fifo);
	}

}
