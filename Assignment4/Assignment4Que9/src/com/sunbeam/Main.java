package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		List l1 = new List();
		
		l1.addFirst(40);
		//40
		l1.addFirst(30);
		//30->40
		l1.addFirst(20);
		//20->30->40
		l1.addFirst(10);
		//10->20->30->40
		l1.addLast(50);
//		l1.addFirst(10);
//		l1.addFirst(20);
//		l1.addFirst(30);
//		l1.addFirst(40);
		
		//10->20->30->40->50
		//l1.deleteFirst();
		//20->30->40->50
		//l1.deleteLast();
		//20->30->40
		//l1.addPosition(60, 7);
		//l1.deletePosition(6);
		l1.displayList();
        System.out.println("Min :"+l1.findmin());
        System.out.println("Max :"+l1.findmax());
		l1.deleteAll();
	}

}