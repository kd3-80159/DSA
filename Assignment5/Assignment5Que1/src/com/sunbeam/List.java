package com.sunbeam;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private int count=0;
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
			//e. move head on newnode
			head = nn;
		}
		count++;
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
		}
		count++;
	}
	public void addPosition(int data,int pos) {
		Node newNode = new Node(data);
	if(pos<1 || pos>count+1)
		System.out.println("Invalid Position");
		if(isEmpty())
			head=newNode;
		else if(pos==1)
			addFirst(data);
		
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			newNode.next=trav.next;
			newNode.prev=trav;
			trav.next=newNode;
			newNode.next.prev=newNode;
		}
		count++;
	}
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. add second node into next of last node
			head.prev.next = head.next;
			//b. add last node into prev of second node
			head.next.prev = head.prev;
			//c. move head on second node
			head = head.next;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. add first node into next of second last node
			head.prev.prev.next = head;
			//b. add second last node into prev of first node
			head.prev = head.prev.prev;
		}
	}
	public void deletePosition(int pos) {
		if(pos<1 || pos>count) {
			System.out.println("Invalid postn");
			return;
		}//special
	
		if(isEmpty())
         System.out.println("List is Empty");
		else if(pos==1)
			deleteFirst();
		else {
			Node trav=head;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			trav.next=trav.next.next;
			trav.next.prev=trav.next;
		}
	}
	public void fDisplay() {
		if(isEmpty())
			return;
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		if(isEmpty())
			return;
		//1. create trav and start at last node
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}while(trav != head.prev);	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	

}







