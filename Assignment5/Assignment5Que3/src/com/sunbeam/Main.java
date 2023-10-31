package com.sunbeam;

public class Main {

public static void main(String[] args) {
	Deque q=new Deque();
//	q.pushFront(20);
//	q.pushFront(10);
//	q.popFront();
//	//q.popFront();
//	System.out.println("Peek data "+q.peekFront());
	q.pushrear(10);
	q.pushrear(20);
	q.poprear();
	System.out.println("Peek data "+q.peekRear());
	
}
}
