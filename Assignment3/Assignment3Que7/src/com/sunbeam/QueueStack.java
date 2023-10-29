package com.sunbeam;
//7. Create queue using stack.


public class QueueStack {
	private int arr[];
	private int top,bottom;
	private final int SIZE;
	public QueueStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
		bottom=-1;
	}
	
	public void push(int data) {
		//a. reposition the top
		top++;
		//b. add data at top index
		arr[top] = data;
	}
	
	public int pop() {
		//a. read data from top index
		
		//b. reposition top
		bottom++;
		int data = arr[bottom];
		//c. return read data
		return data;
	}
	
	public int peek() {
		//a. read/return data of top index
		return arr[bottom+1];
	}
	
	public boolean isEmpty() {
		return top == bottom;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}

}










