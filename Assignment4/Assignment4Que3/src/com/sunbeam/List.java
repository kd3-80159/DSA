package com.sunbeam;

public class List {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int value) {

		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}

			trav.next = newNode;
		}
	}

	public void addPostion(int value, int pos) {
		Node trav = head;
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else if (pos <= 1) {
//			newNode.next=head;
//			head=newNode;
			addFirst(value);
		} else {
			for (int i = 1; i < pos - 1&& trav.next != null; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
	
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (head.next == null) {// special
			head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;

			}
			trav.next = null;
		}
	}

	public void deletePosition(int pos) {

		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (pos <= 1) {
			deleteFirst();
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public void displayAll() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void deleteAll() {
		head = null;
	}

public int  Findmid() {
	Node fast=head;
	Node slow=head;
	while(fast !=null && fast.next !=null) {
		fast=fast.next.next;
		slow=slow.next;
	}
	return slow.data;
}
public void  ReverseList() {
	Node t1=head;
	Node t2=head.next;
	head.next=null;
	while(head !=null) {
		head=t2.next;
		t2.next=t1;
		t1=t2;
		t2=head;
	}
	head = t1;
	
}

}