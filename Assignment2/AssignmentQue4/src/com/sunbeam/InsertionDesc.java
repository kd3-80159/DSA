package com.sunbeam;

import java.util.Arrays;
//4. Modify the insertion sort algorithm to sort the array in descending order
public class InsertionDesc {
	public static void insertionSort(int arr[], int n) {


		for (int i = 1; i < n; i++) {

			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] <temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	
	}
	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };
		//66 55 44 33 22 11
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		//bubbleSort(arr, arr.length);
		//improvesbubbleSort(arr, arr.length);
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}
}
