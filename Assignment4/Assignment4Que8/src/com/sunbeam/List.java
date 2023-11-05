package com.sunbeam;

import com.sunbeam.List.Node;

public class List {
	public class Node {
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
		// 1. create node with given value
		Node newnode = new Node(value);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnode into head
			head = newnode;
		}
	}

//	public void addLast(int value) {
//
//		Node newnode = new Node(value);
//
//		if (isEmpty())
//
//			head = newnode;
//
//		else {
//
//			Node trav = head;
//			while (trav.next != null)
//				trav = trav.next;
//
//			trav.next = newnode;
//		}
//	}
//public void addData(int value) {
//	Node newNode=new Node(value);
//	if(head==null)
//		head=newNode;
//	if()
//}
	public void fdisplayList() {
		// 1. create one referance and start at first node
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			// 2. print(visit) the current node
			System.out.print("  " + trav.data);
			// 3. go on next node
			trav = trav.next;
		} // 4. repeat step 2 and 3 till last node
		System.out.println("");
	}
}