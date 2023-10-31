package com.sunbeam;

public class DoublyCircularMain {
public static void main(String[] args) {
	List l1= new List();
	l1.addFirst(40);
	l1.addFirst(30);
	l1.addFirst(20);
	l1.addFirst(10);
	//l1.addPosition(35,6);
	l1.deletePosition(5);
	l1.fDisplay();
}
}
