package com.sunbeam;

import java.util.Arrays;

public class Main {

public static void main(String[] args) {
	int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
	
	System.out.println("Before sort : " + Arrays.toString(arr));
	
	Heap h = new Heap();
	h.heapMinSort(arr);		
	
	System.out.println("After sort : " + Arrays.toString(arr));

}
}
