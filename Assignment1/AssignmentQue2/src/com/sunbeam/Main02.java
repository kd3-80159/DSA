package com.sunbeam;

import java.util.Scanner;

//2. Create array of employees and search employee by 
//i. empid
//ii. name
//iii. salary
public class Main02 {
	public static int SearchById(Employee arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			// 2. find middle element of the array
			mid = (left + right) / 2;
			// 3. compare middle element with key
			if (key == arr[mid].getEmpid())
				return mid; // if key is matching then return mid
			// 4. if key is less than middle element
			else if (key < arr[mid].getEmpid())
				right = mid - 1; // search key into left sub array
			// 5. if key is greater than middle element
			else
				left = mid + 1; // search key into right sub array
		} // 6. repeat step 2 to 5 till valid partition
			// 7. if key is not found return -1
		return -1;
	}
	public static int SearchByName(Employee arr[], int size, String key) {
        for(int i = 0 ; i < size ; i++) {
		// compare each element of array with key
        	if(arr[i].getName().equals(key))
        		return i;	// if both are equal, then stop
			//if both are not equal, continue
        }
        // if key is not found
        return -1;
	}
	public static int SearchBySalary(Employee arr[], int size, double key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			// 2. find middle element of the array
			mid = (left + right) / 2;
			// 3. compare middle element with key
			if (key == arr[mid].getSalary())
				return mid; // if key is matching then return mid
			// 4. if key is less than middle element
			else if (key < arr[mid].getSalary())
				right = mid - 1; // search key into left sub array
			// 5. if key is greater than middle element
			else
				left = mid + 1; // search key into right sub array
		} // 6. repeat step 2 to 5 till valid partition
			// 7. if key is not found return -1
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choice;
		int index ;
		Employee arr[] = new Employee[3];
		arr[0] = new Employee(1, "c", 100);
		arr[1] = new Employee(2, "a", 200);
		arr[2] = new Employee(3, "b", 300);

		while (!exit) {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a id u want to Search");
				int id = sc.nextInt();

				 index = SearchById(arr, 3, id);
				if (index != -1)
					System.out.println("Key is found at index " + index);
				else
					System.out.println("Key is not found");
				break;
			case 2:
				System.out.println("Enter a name u want to Search");
				String name  = sc.next();
				 index = SearchByName(arr,3,name);
					if (index != -1)
						System.out.println("Key is found at index " + index);
					else
						System.out.println("Key is not found");
				break;
			case 3:
				System.out.println("Enter a Salary u want to Search");
				double  sal  = sc.nextDouble();
				 index = SearchBySalary(arr,3,sal);
					if (index != -1)
						System.out.println("Key is found at index " + index);
					else
						System.out.println("Key is not found");
				break;
			case 100:
				exit = true;
				break;
			}

		}

	}

}
