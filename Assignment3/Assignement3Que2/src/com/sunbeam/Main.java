package com.sunbeam;

import java.util.Scanner;
//2. Insert 5 elements in stack and 
//find maximum value in stack without traversing it.

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		int choice;

		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Find max");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					if(st.isEmpty()) {
						st.push(data);
					}else {
						if(st.peek()<data) {
							st.push(data);
						}
			 			else {
						int temp=st.peek();
							st.pop();
							st.push(data);
							st.push(temp);
						}
							
							
					}
					
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped Data = " + st.pop());
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;
			case 4:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Max Data = " + st.peek());
				break;
				
				
			}
		}while(choice != 0);
		
		sc.close();
	}

}



