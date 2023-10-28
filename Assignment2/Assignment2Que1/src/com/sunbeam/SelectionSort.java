package com.sunbeam;

import java.util.Arrays;

//1. Write a selection sort function to sort array and returns no of comparisions.
public class SelectionSort {
	static int noOfComp = 0;
	static int noOfPass = 0;

	public static void selectionSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			noOfPass++;
			
			for (int j = i + 1; j < n; j++) {
				noOfComp++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("No of noOfPass = " + noOfPass);
		System.out.println("No of comp = " + noOfComp);
		
	}//5 15

	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}
}