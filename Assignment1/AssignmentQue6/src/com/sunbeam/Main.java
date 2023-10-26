package com.sunbeam;

import java.util.Scanner;

//4. Implement linear search algorithm to find the nth occurence of the given element.
//If nth occurrence is not found, return -1.
public class Main {
	public static int findNthOccur(int arr[], int size, int key,int n) {
		// traverse collection(array) from one end to another
		int count=0;
        for(int i = 0 ; i < size ; i++) {
		// compare each element of array with key
        	if(arr[i] == key)
        		count++;	// if both are equal, then stop
        	if(count==n)
        		return i;
			//if both are not equal, continue
        }
        // if key is not found
        return -1;
	}

	public static void main(String[] args) {
		int arr[] = {66, 11, 33, 88, 22, 99, 77, 33};
		
		// take key from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		System.out.print("Enter nth occurence  to be searched : ");
		int n = sc.nextInt();
		
		int index = findNthOccur(arr, arr.length, key, n);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}

}
