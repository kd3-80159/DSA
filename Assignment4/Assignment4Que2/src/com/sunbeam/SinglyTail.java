
package com.sunbeam;

public class SinglyTail {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node tail;

	public SinglyTail() {

		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {

			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {

			tail = newNode;
			tail.next = tail;
		} else {
			Node trav = tail.next;
			while (trav != tail.next) {
				trav = trav.next;
			}
			newNode.next = tail.next;
			tail.next = newNode;

		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		}else if(tail.next==tail) {
			tail=null;
		}
		else {
			tail.next = tail.next.next;

		}

	}
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}else if(tail.next==tail) {
			tail=null;
		}
		else {
			Node trav=tail;
			while(trav.next !=tail) {
				trav=trav.next;
			}
			trav.next=tail.next;
			//tail=trav.next;
			//tail=trav.next;
		}
	}
	

	public void displayAll() {
		Node trav = tail.next;
		System.out.print("List :");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
		System.out.println("");
	}

	public void deleteAll() {
		tail = null;
	}
}
