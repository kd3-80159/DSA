package com.sunbeam;
//6. Sort singly linear list using bubble sort.
public class Main {

	public static void main(String[] args) {
		List l1=new List();
		l1.addLast(20);
		l1.addLast(15);
		l1.addLast(35);
		l1.addLast(10);
		l1.displayList();
		l1.BubbleSort();
		//l1. bubbleSort();
		l1.displayList();
	}
}
