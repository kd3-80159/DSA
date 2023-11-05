package com.sunbeam;

public class Main {
public static void main(String[] args) {
	SinglyLinear l1 = new SinglyLinear();
	l1.addLast(10);
	l1.addLast(20);
	l1.addLast(30);
	l1.addLast(40);
	l1.deleteLast();
	l1.deleteLast();
	l1.displayAll();
}
}
