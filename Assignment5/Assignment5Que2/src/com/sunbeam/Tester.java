package com.sunbeam;

public class Tester {
public static void main(String[] args) {
//	Stack s1 = new Stack();
//	s1.push(40);
//	s1.push(30);
//	s1.push(20);
//	s1.push(10);
//	//s1.pop();
//	System.out.println("Peek data "+s1.peek());
	
	Queue q1=new Queue();
	q1.enque(10);
	q1.enque(20);
	q1.enque(30);
	q1.enque(40);
	q1.deque();
	System.out.println("Peek data "+q1.peek());
	
}
}
