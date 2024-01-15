package src.main.practice.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2, 5, 7, 9, 22, 11, 33, 15 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		System.out.println("After Bubble Sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
