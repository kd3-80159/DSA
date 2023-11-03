package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
public static void  quickSort(int arr[],int left,int right) {
	if(left>=right)
		return;
	int i=left;
	int j=right;
	
	while(i<j) {
		for(;i<=right && arr[i]<=arr[right];i++);
		for(;arr[j]>arr[right];j--);
		if(i<j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
	int temp=arr[right];
	arr[right] = arr[j];
	arr[j]=temp;
	quickSort(arr, left, j-1);
	quickSort(arr, j+1, right);
}

	public static void main(String[] args) {
		int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After sort : " + Arrays.toString(arr));
	}

}

