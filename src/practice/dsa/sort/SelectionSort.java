package practice.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2, 5, 7, 9, 22, 11, 33, 15 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		System.out.println("After Selection Sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
