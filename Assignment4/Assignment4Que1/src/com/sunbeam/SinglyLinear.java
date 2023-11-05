package com.sunbeam;



public class SinglyLinear {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node head;
	private Node tail;

	public SinglyLinear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail=newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int value) {

		Node newNode = new Node(value);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			
			tail.next = newNode;
			tail=newNode ;

		}
	}



	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
			if(head==null)//anything else?
				tail=null;
		}
	}

	public void deleteLast() {

		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (head==tail) {// special
			head = null;
			tail=null;
		} else {
			
			Node trav = head;
			while (trav.next!= tail) {
				trav = trav.next;

			}
			trav.next = null;
			tail=trav;

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
}
