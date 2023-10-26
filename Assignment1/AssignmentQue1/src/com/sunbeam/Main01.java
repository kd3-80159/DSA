package com.sunbeam;

import java.util.Scanner;

//1. Write a program to print no of comparisions done to search a key in
//i. linear search

public class Main01 {
	static int noOfcomp = 0;

	public static int linear_search(int arr[], int size, int key) {
		// traverse collection(array) from one end to another

		for (int i = 0; i < size; i++) {

			noOfcomp++;
			// compare each element of array with key

			if (arr[i] == key)

				return i; // if both are equal, then stop
			// if both are not equal, continue
		}

		// if key is not found
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };

		// take key from user
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		System.out.println("Comparison = " + noOfcomp);
		sc.close();
	}

}
