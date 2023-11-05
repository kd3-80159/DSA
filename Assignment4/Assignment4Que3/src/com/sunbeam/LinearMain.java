package com.sunbeam;

public class LinearMain {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		
		//System.out.println("Mid ELe = " + l1.Findmid());
		l1.displayAll();
		l1.ReverseList();
		l1.displayAll();
	}
}
