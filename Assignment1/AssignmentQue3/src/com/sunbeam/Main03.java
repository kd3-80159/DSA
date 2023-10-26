package com.sunbeam;

import java.util.Scanner;

public class Main03 {
	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
			
		while(left <= right) {
			//2. find middle element of the array
			mid = (left + right)/2;
			//3. compare middle element with key
			if(key == arr[mid])
				return mid;	// if key is matching then return mid
			//4. if key is less than middle element
			else if(key < arr[mid])
				right = mid - 1;	// search key into left sub array
			//5. if key is greater than middle element
			else
				left = mid + 1;		// search key into right sub array
		}//6. repeat step 2 to 5 till valid partition
		//7. if key is not found return -1
			return -1;
	}
	public static int linear_search(int arr[], int size, int key) {
		// traverse collection(array) from one end to another
        for(int i = 0 ; i < size ; i++) {
		// compare each element of array with key
        	if(arr[i] == key)
        		return i;	// if both are equal, then stop
			//if both are not equal, continue
        }
        // if key is not found
        return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		//1. take key from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		//int index = linear_search(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}

}
//Bibary search someTime search give First Occurance sometimes...& someTime Not

//Linear search search give First Occurance 



