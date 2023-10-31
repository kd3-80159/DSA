package com.sunbeam;

class BSTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	public Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

//	public void addNode(int value) {
//		Node newNode = new Node(value);
//		if (isEmpty())
//			root = newNode;
//		else {
//			Node trav = root;
//			while (true) {
//				if (value < trav.data) {
//					if (trav.left == null) {
//						trav.left = newNode;
//						break;
//					} else {
//						trav = trav.left;
//					}
//				}else {
//					if(trav.right==null) {
//						trav.right=newNode;
//						break;					
//				}
//					else {
//						trav=trav.right;
//					}
//
//			}
//		}
//	}
//}
	//Recusion
	public void addNode(int value) {
         root = addRecursive(root,value);
	}
	Node addRecursive(Node trav,int value) {
		if(trav==null)
			return new Node(value);
		if(value<trav.data)
			trav.left=addRecursive(trav.left, value);
		else
			trav.right=addRecursive(trav.right, value);
		
		return trav;
	}

	public void preOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.data);
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}

	public void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
}