package com.sunbeam;
//6. Create stack using queue. 



public class StackQueue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public StackQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		//front = -1;
		rear = -1;
	}
	public void push(int data) {
		// a. reposition rear (inc)
		rear++;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public void pop() {
		// a. reposition front
		rear --;
	}
	
	public int peek() {
		//a. read/return data of front + 1 index
		return arr[rear];
	}
	
	public boolean isFull() {
		return rear == SIZE -1;
	}
	
	public boolean isEmpty() {
		return rear == -1;
	}
}






