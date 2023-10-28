package com.sunbeam;
//3. Write a insertion sort function to sort array and returns no of comparisions.

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[], int n) {
int noOfpass=0;
int noOfcomp=0;

		for (int i = 1; i < n; i++) {
			noOfpass++;
			noOfcomp++;
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("No of pass = "+noOfpass);
		System.out.println("No of comp = "+noOfcomp);
	}//5 5


	public static void main(String[] args) {

		//int arr[] = { 44, 11, 55, 22, 66, 33 };
		int arr[] = {11, 22, 33, 44, 55, 66};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}
}
