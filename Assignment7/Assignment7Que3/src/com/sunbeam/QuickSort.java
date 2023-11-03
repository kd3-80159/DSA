package com.sunbeam;

import java.util.Arrays;

public class QuickSort {
public static void quickSort(int arr[],int left,int right) {
	if(left>=right)
		return;
	int mid = (left+right)/2;
	int i=left;
	int j=right;
	while(i<j) {
		for(;i<=right&&arr[i]>=arr[left];i++);
		for(;arr[j]<arr[left];j--);
		if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	int temp=arr[j];
	arr[j]=arr[left];
	arr[left]=temp;
	quickSort(arr, left, j-1);
	quickSort(arr, j+1, right);
}
public static void main(String[] args) {
	//int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
	int arr[] = {6, 3, 9, 1, 7, 2, 5, 6, 8};
	System.out.println("Before sort : " + Arrays.toString(arr));
	quickSort(arr, 0, arr.length-1);
	System.out.println("After sort : " + Arrays.toString(arr));
}
}
