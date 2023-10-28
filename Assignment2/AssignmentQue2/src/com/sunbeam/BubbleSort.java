package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
public static void bubbleSort(int arr[],int n) {
	int noOfPass=0;
	int noOfComp=0;
	
	for(int i=1;i<n;i++) {
		noOfPass++;
		for(int j=0;j<n-1;j++) {
			noOfComp++;
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("No of pass "+noOfPass);
	System.out.println("No of comp "+noOfComp);
}//5 25
public static void improvesbubbleSort(int arr[],int n) {
	int noOfPass=0;
	int noOfComp=0;
	
	for(int i=1;i<n;i++) {
		noOfPass++;
		for(int j=0;j<n-i;j++) {
			noOfComp++;
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("No of pass "+noOfPass);
	System.out.println("No of comp "+noOfComp);
}//5 15
public static void furtherImprovesbubbleSort(int arr[],int n) {
	int noOfPass=0;
	int noOfComp=0;
	int flag=0;
	for(int i=1;i<n;i++) {
		noOfPass++;
		for(int j=0;j<n-i;j++) {
			
			noOfComp++;
			if(arr[j]>arr[j+1]) {
				flag=1;
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		if(flag==0) {
			break;
		}
	}
	System.out.println("No of pass "+noOfPass);
	System.out.println("No of comp "+noOfComp);
}//1 5 for sorted one

public static void main(String[] args) {

	//int arr[] = { 44, 11, 55, 22, 66, 33 };
	int arr[] = {11, 22, 33, 44, 55, 66};
	System.out.println("Array before sort : " + Arrays.toString(arr));
	
	//bubbleSort(arr, arr.length);
	//improvesbubbleSort(arr, arr.length);
	furtherImprovesbubbleSort(arr, arr.length);
	System.out.println("Array after sort : " + Arrays.toString(arr));
}

}
