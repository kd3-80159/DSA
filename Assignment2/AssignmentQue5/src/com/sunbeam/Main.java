package com.sunbeam;

import java.util.Arrays;

//5. Write a function to sort employees by their salary.
public class Main {
	public static void sortEmployeeBySalary(Employee arr[], int n) {
		Employee temp = new Employee();
		for (int i = 1; i < n; i++) {

			 temp = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j].getSalary() > temp.getSalary()) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = temp;
	}
	}

	public static void main(String[] args) {

		Employee arr[] = new Employee[3];
		arr[0] = new Employee(1, "c", 300);
		arr[1] = new Employee(2, "a", 100);
		arr[2] = new Employee(3, "b", 50);

		//System.out.println("Before Sort ");
	     System.out.println("Before Sort "+Arrays.toString(arr));
		sortEmployeeBySalary(arr, arr.length);
		System.out.println("After Sort "+Arrays.toString(arr));
		

	}
}
