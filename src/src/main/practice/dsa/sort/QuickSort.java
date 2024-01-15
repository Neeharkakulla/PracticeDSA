package src.main.practice.dsa.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2, 5, 7, 9, 22, 11, 33, 15 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);

		System.out.println("After Quick Sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = getPartitionIndex(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private static int getPartitionIndex(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
