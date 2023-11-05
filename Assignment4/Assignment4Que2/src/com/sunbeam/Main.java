package com.sunbeam;

public class Main {
public static void main(String[] args) {
	SinglyTail c1= new SinglyTail();
//	c1.addFirst(20);
//	c1.addFirst(10);
	c1.addLast(20);
	c1.addLast(10);
	c1.addLast(5);
	//c1.deleteFirst();
	c1.deleteLast();
	
	c1.displayAll();
	}
}
