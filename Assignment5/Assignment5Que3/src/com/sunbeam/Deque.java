package com.sunbeam;

public class Deque {
List l1;
public Deque() {
	l1=new List();
}
public void pushFront( int data) {
	l1.addFirst(data);
}
public void popFront() {
	l1.deleteFirst();
}
public void pushrear(int data) {
	l1.addFirst(data);
}
public void poprear() {
	l1.deleteLast();
}
public int  peekFront() {
	return l1.getFront();
}
public int  peekRear() {
	return l1.getRear();
}
}
