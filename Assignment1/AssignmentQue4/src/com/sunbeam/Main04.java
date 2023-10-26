package com.sunbeam;

import java.util.Scanner;

//4. to find rank of an element in a stream of integers.
//rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
//	
//	Input: { 10, 20, 15, 3, 4, 4, 1 }
//	Ouput: Rank of 4 is: 4
public class Main04 {
	static int rank = 0;

	public static int linear_search(int arr[], int size, int key) {
		// traverse collection(array) from one end to another
		for (int i = 0; i < size; i++) {
			// compare each element of array with key
			if (arr[i] == key) {
				rank++;
				
			}
			if(key>arr[i] ) {
				rank++;// if both are equal, then stop
			}
				// if both are not equal, continue
		}
		// if key is not found
		return rank;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		// 1. take key from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1)
			System.out.println("Rank of an element " + rank);
		else
			System.out.println("Key is not found");

		sc.close();
	}

}
