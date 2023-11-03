package com.sunbeam;

import java.util.Arrays;

public class Heap {
	private int SIZE;

	public Heap() {
		SIZE = 0;
	}


	public void addHeap(int arr[]) {
	SIZE++;
	int pi = SIZE / 2;
	while (pi >= 1) {
		int ci = pi * 2;
		if (ci + 1 <= SIZE && arr[ci + 1] < arr[ci]) {
			ci = ci + 1;
		}
		if (arr[pi] <arr[ci])
			break;
		int temp = arr[pi];
		arr[pi] = arr[ci];
		arr[ci] = temp;
		pi = pi / 2;

	}

}

public void delHeap(int arr[]) {
	int min = arr[1];
	arr[1] = arr[SIZE];
	arr[SIZE] = min;
	SIZE--;
	int ci = 1 * 2;
	while (ci <= SIZE) {
		int pi = ci / 2;
		if (ci + 1 <= SIZE && arr[ci + 1] < arr[ci])
			ci = ci + 1;
		if (arr[pi] < arr[ci])
			break;
		int temp = arr[ci];
		arr[ci] = arr[pi];
		arr[pi] = temp;
		ci = ci * 2;
	}
}
	public void createHeap(int arr[]) {
		for (int i = 1; i < arr.length; i++)
			addHeap(arr);
	}

	public void deleteeHeap(int arr[]) {
		for (int i = 1; i < arr.length; i++)
			delHeap(arr);
	}

	public void heapMinSort(int arr[]) {
		createHeap(arr);
		System.out.println("Heap : " + Arrays.toString(arr));
		deleteeHeap(arr);
	}
}
