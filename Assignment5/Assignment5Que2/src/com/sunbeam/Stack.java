package com.sunbeam;

public class Stack {
List l1;
public Stack() {
	l1=new List();
}
public boolean StackEmpty() {
	return l1.isEmpty();
}
public boolean Empty() {
	return l1.isEmpty();
}
public void push(int data) {
	l1.addFirst(data);
}
public void pop() {
	l1.deleteFirst();
}
public int peek() {
	return l1.getData();
}

}
