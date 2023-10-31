package com.sunbeam;

public class Queue {
 List l1;
 public Queue() {
	 l1=new List();
 }
 public void enque(int data) {
	 l1.addLast(data);
 }
 public void deque( ){
	 l1.deleteFirst();
 }
 public int peek( ){
	return  l1.getData();
 }
}
